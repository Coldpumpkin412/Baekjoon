import java.util.*;

class Solution {
    public int solution(int[] sides) {
        //(두 값의 차이+1) 부터 (두 배열의 합-1)의 개수
        return (sides[0]+sides[1]-1)-(Math.abs(sides[0]-sides[1])+1)+1;
       
    }
}