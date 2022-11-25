import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        //알파벳별 사용된 횟수를 저장할 배열 선언
        int[] beforeArr = new int[26];
        int[] afterArr = new int[26];
        
        for(int i=0 ; i<before.length() ; i++){
            //각각의 알파벳을 아스키코드를 활용하여 배열의 인덱스로 사용
            //알파벳이 사용될 때마다 해당 위치의 값이 증가
            beforeArr[before.charAt(i)-'a']++; 
            afterArr[after.charAt(i)-'a']++;
        }
        //사용된 알파벳의 수가 같다면 순서를 바꿔 만들 수 있음
        if(Arrays.equals(beforeArr, afterArr)) answer = 1;
        else answer = 0;
        
        return answer;
    }
}