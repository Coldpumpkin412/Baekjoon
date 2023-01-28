import java.util.*;
import java.util.Collections;


class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(""); //내림차순 정렬을 위해 문자열배열로 선언
        
        Arrays.sort(arr, Collections.reverseOrder()); //내림차순 정렬
        
        for(String str : arr) answer += str;

        
        return answer;
    }
}