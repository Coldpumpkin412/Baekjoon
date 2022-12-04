import java.util.*;
//import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] s = Long.toString(n).split(""); //정렬을 위해 문자열배열로 변환
        String ans = ""; //정답을 저장할 배열
        Arrays.sort(s, Collections.reverseOrder()); //내림차순 정렬
        
        for(String arr : s){
            ans += arr; //배열값 하나씩 대입
        }
        
        answer = Long.parseLong(ans);
        return answer;
    }
}