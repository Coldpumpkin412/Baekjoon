import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        //0부터 100만까지 모든 5의 배수들을 확인
        for(int i=0 ; i<=1000000 ; i+=5){
            String str = i + "";
            
            if(str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4") ||
               str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9") ||
               i<l || i>r){
                continue;
            }else{
                list.add(Integer.parseInt(str));
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0 ; i<list.size() ; i++){
            answer[i] = list.get(i);
        }
        
        if(list.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}