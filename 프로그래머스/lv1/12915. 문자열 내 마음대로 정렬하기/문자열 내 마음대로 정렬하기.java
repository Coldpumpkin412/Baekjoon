import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int index=0;
        
        Arrays.sort(strings); //사전식으로 정렬
        
        for(int i=97 ; i<123 ; i++){ //아스키 코드 활용
            for(int j=0 ; j<answer.length ; j++){
                if(strings[j].charAt(n)==(char)i){
                    answer[index] = strings[j];
                    index++;
                }
            }
        }
              
        return answer;
    }
}