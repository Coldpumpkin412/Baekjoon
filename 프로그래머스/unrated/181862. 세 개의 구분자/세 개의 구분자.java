import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        String[] str = myStr.replace("a", " ").replace("b", " ").replace("c", " ").split(" ");
        
        for(int i=0 ; i<str.length ; i++){
            if(!str[i].equals("")) list.add(str[i]);
        }
        
        String[] answer;
        if(list.size()==0){
            answer = new String[1];
            answer[0] = "EMPTY";
        }else{
            answer = new String[list.size()];
            for(int i=0 ; i<answer.length ; i++){
                answer[i] = list.get(i);
            }
        }
        
        return answer;
    }
}