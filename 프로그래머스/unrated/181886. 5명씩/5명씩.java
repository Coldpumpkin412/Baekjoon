import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length%5==0) ? names.length/5 : names.length/5+1];
        
        Queue<String> queue = new LinkedList<>();
        
        int index=0;
        for(int i=0 ; i<names.length ; i++){
            queue.offer(names[i]);
            
            if(queue.size() == 5){
                answer[index] = queue.poll();
                queue.clear();
                index++;
            }
        }
        
        if(!queue.isEmpty()){
             answer[index] = queue.poll();
        }
       
        
        return answer;
    }
}