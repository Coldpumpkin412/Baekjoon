import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue<Integer> q = new LinkedList<>(); //선입선출 구조를 갖는 큐 활용
		
		q.offer(arr[0]);
		
        //큐에 배열 값 넣기(중복일 경우 continue)
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[i-1]==arr[i]) continue;
			else q.offer(arr[i]);
		}
        
        //큐의 값 배열에 넣기
        int[] answer = new int[q.size()];
		
		for(int i=0 ; i<answer.length ; i++){
            answer[i] = q.poll();
        }
        
        return answer;
    }
}