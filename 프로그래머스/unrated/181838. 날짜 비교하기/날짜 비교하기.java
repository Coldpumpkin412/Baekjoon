import java.util.*;

class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        Date first = new Date(date1[0], date1[1], date1[2]);
        Date second = new Date(date2[0], date2[1], date2[2]);
        
        if(first.before(second)) answer = 1;
        
        return answer;
    }
}