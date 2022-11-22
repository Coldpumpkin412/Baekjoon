import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>(); //가변 리스트 선언
        
        for(int i=1 ; i<=n ; i++){
            if(n%i==0){
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()]; //리스트의 크기와 같은 크기의 배열 선언
        
        for(int i=0 ; i<list.size() ; i++){
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }
}