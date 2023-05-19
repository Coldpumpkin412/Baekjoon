import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        Stack<Character> stack = new Stack<>();
        String answer = "";
        
        for(int i=0 ; i<queries.length ; i++){
            //뒤집는 구간 이전 문자열
            String before = my_string.substring(0, queries[i][0]);
            //뒤집는 구간
            String now = my_string.substring(queries[i][0], queries[i][1]+1);
            //뒤집는 구간 이후 문자열
            String after = my_string.substring(queries[i][1]+1, my_string.length());
            
            //뒤집을 구간의 문자들을 스택에 넣기
            for(int j=0 ; j<now.length() ; j++){
                stack.push(now.charAt(j));
            }
            
            //구간 이전 문자열 + 스택 빌때까지 팝(거꾸로 꺼내짐) + 구간 이후 문자열
            answer += before;
            while(!stack.isEmpty()){
                answer += stack.pop();
            }
            answer += after;
            
            //뒤집어진 문자열 할당 후 answer는 다시 초기화
            my_string = answer;
            answer = "";
        }
        
        return my_string;
    }
}