import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        answer[0] = -1; //첫 원소는 무조건 처음 나오는것
        
        for(int i=1 ; i<answer.length ; i++){
            boolean check = true; //이전에 나왔는지 체크
            
            for(int j=0 ; j<i ; j++){
                if(s.charAt(i)==s.charAt(j)) {
                    answer[i]=i-j;
                    check = false;
                }
            }
            if(check) answer[i] = -1;
        }
        return answer;
    }
}