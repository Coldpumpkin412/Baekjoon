import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        Arrays.sort(str);
        
        List<String> list = new ArrayList<>();
        for(int i=0 ; i<str.length ; i++){
            if(!str[i].equals("")) list.add(str[i]);
        }
        
        String[] answer = new String[list.size()];
        for(int i=0 ; i<list.size() ; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}