import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        
        int index = 0;
        boolean check = false;
        
        for(int i=0 ; i<str_list.length ; i++){
            if(str_list[i].equals("l")){
                index = i;
                check = true;
                break;
            }else if(str_list[i].equals("r")){
                index = i;
                break;
            }
        }
        
        if(check){
            for(int i=0 ; i<index ; i++){
                list.add(str_list[i]);
            }
        }else{
            for(int i=index+1 ; i<str_list.length ; i++){
                list.add(str_list[i]);
            }
        }
            
        
                     
        String[] answer = new String[list.size()];
        if(answer.length==0) return answer;
        else{
            for(int i=0 ; i<answer.length ; i++){
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}