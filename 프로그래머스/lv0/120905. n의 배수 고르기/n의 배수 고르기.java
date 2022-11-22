import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>(); //정답 저장할 리스트 선언
        int count = 0;
        
        for(int i=0 ; i<numlist.length ; i++){
            if(numlist[i]%n == 0){
                list.add(numlist[i]);
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        for(int i=0 ; i<count ; i++){
            answer[i] = list.get(i).intValue();
        }
        
        return answer;
    }
}