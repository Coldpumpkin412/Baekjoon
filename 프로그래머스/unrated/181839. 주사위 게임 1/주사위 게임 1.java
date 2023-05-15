import java.util.*;

class Solution {
    public int solution(int a, int b) {
        //둘 중 하나만 홀수 = 더했을때 홀수
        if((a+b)%2 == 1) return 2*(a+b);
        else if(a%2==1 && b%2==1){ //둘 다 홀수인경우
            return a*a+b*b;
        }else{ //그 외
            return (int)Math.abs(a-b);
        }
    }
}