import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        char tmp; //문자 변환시 사용할 매개변수
        char[] arr = new char[A.length()]; //A의 문자를 각각 저장할 배열
        
        for(int i=0 ; i<A.length() ; i++){
            arr[i] = A.charAt(i); //문자열 A를 각각 문자의 배열로 저장
        }
        
        if(A.equals(B)) return 0; //반복이전에 문자열A와 B가 같은지 확인
        while(answer != A.length()-1){
            answer++;
            
            tmp = arr[A.length()-1]; //tmp변수에 제일 마지막 값 저장
            for(int i=A.length()-1 ; i>0 ; i--){
                arr[i] = arr[i-1]; //tmp변수에 저장되어 비어있는 마지막 값부터 채워넣음
            }
            arr[0] = tmp; //첫번째 값은 tmp에 저장돼있는 배열의 마지막 값 저장
            
            String str = new String(arr); //배열로 이루어진 문자들을 문자열로 변환
            if(str.equals(B)) return answer; //B와 같으면 현재 회차를 출력
        }
        
        return -1; //반복문에서 벗어나면 맞는값이 없는것이므로 -1출력
    }
}