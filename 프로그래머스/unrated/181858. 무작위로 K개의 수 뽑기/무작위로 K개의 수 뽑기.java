import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        Queue<Integer> queue = new LinkedList<>();
        
        int[] answer = new int[k];
        
        for(int i=0 ; i<arr.length ; i++){
            if(!queue.contains(arr[i])) queue.offer(arr[i]);
        }
        
        for(int i=0 ; i<k ; i++){
            answer[i] = queue.isEmpty() ? -1 : queue.poll();
        }
        
        return answer;
    }
}