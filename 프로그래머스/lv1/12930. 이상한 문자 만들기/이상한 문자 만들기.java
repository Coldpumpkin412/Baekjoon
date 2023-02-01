import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] word = s.split(""); //한글자씩 분할하여 문자열에 저장
        int count = 0; //인덱스용 변수 선언
        
        for(int i=0 ; i<word.length ; i++){
            if(word[i].equals(" ")) count=0; //공백을 만나면 인덱스 초기회
            else if(count%2==0){
                word[i] = word[i].toUpperCase(); //짝수번째 문자는 대문자로
                count++;
            } else if(count%2!=0){
                word[i] = word[i].toLowerCase(); //호수번째 문자는 소문자로
                count++;
            }
            answer += word[i];
        }
        
        return answer;
    }
}