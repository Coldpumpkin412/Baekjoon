import java.util.*;

class Solution {
    public int solution(int a, int b) {
        String first = Integer.toString(a)+Integer.toString(b);
        String second = Integer.toString(b)+Integer.toString(a);
        
        return Math.max(Integer.parseInt(first), Integer.parseInt(second));
    }
}