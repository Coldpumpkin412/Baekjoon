import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list_answer = new ArrayList<>();
        
        Arrays.sort(arr);
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]%divisor == 0) list_answer.add(arr[i]);
        }

        
        if(list_answer.size() == 0) {
            int[] x = {-1};
            return x;
        }
            
        int[] answer = new int[list_answer.size()];

        
        for(int i=0 ; i<answer.length ; i++){
            answer[i] = list_answer.get(i).intValue();
        }
        
        return answer;
    }
}