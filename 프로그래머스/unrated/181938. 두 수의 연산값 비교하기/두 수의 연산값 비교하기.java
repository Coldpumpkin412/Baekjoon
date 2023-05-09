import java.util.*;

class Solution {
    public int solution(int a, int b) {
        String str = Integer.toString(a)+Integer.toString(b);
        
        return Math.max(Integer.parseInt(str), 2*a*b);
    }
}