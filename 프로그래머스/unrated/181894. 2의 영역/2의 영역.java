import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        boolean check = false;
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == 2){
                start = Math.min(start, i);
                end = Math.max(end, i);
                check = true;
            }
        }
        
        int[] answer = {-1};
        
        if(check){
            answer = new int[end-start+1];
            for(int i=start ; i<=end ; i++){
                answer[i-start] = arr[i]; 
            }
        }
        
        return answer;
    }
}