import java.util.*;

import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase(); //소문자로 변경
        char[] chars = my_string.toCharArray(); //문자열을 문자배열로 변경
    
        Arrays.sort(chars); //문자배열 오름차순 정렬
        answer = new String(chars); //문자열에 집어넣기
        
        return answer;
    }
}