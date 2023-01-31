import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0 ; i<my_string.length() ; i++){
            if('a'<= my_string.charAt(i) && my_string.charAt(i) <= 'z'){
                answer += Character.toUpperCase(my_string.charAt(i));
            } else{
                answer += Character.toLowerCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}