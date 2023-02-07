import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int start = 2;
        
        while(n>=2){
            if(n%start == 0){ //나머지가 0일때
                list.add(start); //리스트에 현재 값 추가
                n /= start; //나누어진 값을 다시 저장
            } else start++; //나누어지지 않으면 다음 수 비교
        }
        
        Set<Integer> set = new HashSet<>(list); //중복제거를 위해 set으로 변경
        List<Integer> newlist = new ArrayList<>(set); //중복제거 후 다시 리스트로 변환
        
        int[] answer = new int[newlist.size()]; //정답을 저장할 배열 선언
        
        for(int i=0 ; i<newlist.size() ; i++){
            //리스트의 값을 하나씩 정수형으로 변환 후 저장
            answer[i] = newlist.get(i).intValue();
        }
        Arrays.sort(answer);
        
        return answer;
    }
}