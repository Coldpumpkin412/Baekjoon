import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        boolean answer;
        
        answer = str1.contains(str2);
        
        if(answer) return 1;
        else return 2;
    }
}