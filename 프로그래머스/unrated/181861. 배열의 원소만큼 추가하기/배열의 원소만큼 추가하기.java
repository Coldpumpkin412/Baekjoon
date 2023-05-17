import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0 ; i<arr.length ; i++){
            int count = arr[i];
            
            while(count-->0){
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0 ; i<list.size() ; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}