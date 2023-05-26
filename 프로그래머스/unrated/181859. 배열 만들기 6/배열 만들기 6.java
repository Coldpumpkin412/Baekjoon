import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        
        while(i<arr.length){
            if(list.isEmpty()){
                list.add(arr[i]);
                i++;
            }else{
                if(list.get(list.size()-1) == arr[i]){
                    list.remove(list.size()-1);
                    i++;
                }else{
                    list.add(arr[i]);
                    i++;
                }
            }
        }
        
        int[] answer;
        
        if(list.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[list.size()];
            for(int j=0 ; j<answer.length ; j++){
                answer[j] = list.get(j);
            }
        }
         
        
        return answer;
    }
}