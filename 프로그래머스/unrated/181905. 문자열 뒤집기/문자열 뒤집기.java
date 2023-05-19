import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        Stack<Character> stack = new Stack<>();
        
        String before = my_string.substring(0, s);
        String now = my_string.substring(s, e+1);
        String after = my_string.substring(e+1, my_string.length());
        
        for(int i=0 ; i<now.length() ; i++){
            stack.push(now.charAt(i));
        }
        
        answer += before;
        while(!stack.isEmpty()){
            answer += stack.pop();
        }
        answer += after;
        
        return answer;
    }
}