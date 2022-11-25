import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[26];
        
        for(int i=0 ; i<s.length() ; i++){
            arr[s.charAt(i)-'a']++; //알파벳이 등장할때마다 해당 인덱스가 가리키는 값 증가
        }
        
        for(int i=0 ; i<26 ; i++){
            if(arr[i]==1) { //값이 1인(한번만 등장하는) 위치의 인덱스 확인
                answer += (char)(i+97); //인덱스를 아스키코드 활용하여 문자로 변환
            }
        }
        return answer;
    }
}