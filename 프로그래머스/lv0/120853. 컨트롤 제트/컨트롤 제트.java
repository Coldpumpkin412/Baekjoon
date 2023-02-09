import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" "); //공백을 기준으로 주어진 문자열을 구분
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i].equals("Z")){ //문자열이 Z라면
                //Integer.parseInt를 활용하여 문자열을 정수형으로 변환
                answer -= Integer.parseInt(arr[i-1]); //이전 입력만큼 다시 빼준다
            } else{ //문자열이 Z가 아니라면
                try{
                    answer += Integer.parseInt(arr[i]); //더해준다
                } catch(NumberFormatException e){}
            }
        }
        
        return answer;
    }
}