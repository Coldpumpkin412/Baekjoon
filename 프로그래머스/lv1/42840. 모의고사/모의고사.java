import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int size = answers.length;
        int[] first = {1,2,3,4,5}; //1번 수포자의 답안 저장배열
        int[] second = {2,1,2,3,2,4,2,5}; //2번 수포자의 답안 저장배열
        int[] third = {3,3,1,1,2,2,4,4,5,5}; //3번 수포자의 답안 저장배열
        int[] cnt = new int[3]; //정답 개수 저장 배열
        
        for(int i=0 ; i<size ; i++) {
			if(first[i%first.length] == answers[i]) cnt[0]++;
			if(second[i%second.length] == answers[i]) cnt[1]++;
			if(third[i%third.length] == answers[i]) cnt[2]++;
		}
        
        int max = Math.max(Math.max(cnt[0],cnt[1]),cnt[2]); //맞춘 답의 개수의 최대값 저장
        
        //최대로 맞춘 정답자를 리스트에 추가
        List<Integer> list = new ArrayList<>();
        if(max==cnt[0]) list.add(1);
		if(max==cnt[1]) list.add(2);
		if(max==cnt[2]) list.add(3);
        
        //리스트의 값 배열에 저장
        int[] answer = new int[list.size()];
        for(int i=0 ; i<answer.length ; i++) answer[i]=list.get(i);
        
        return answer;
    }
}