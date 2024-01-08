import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //지우고 남은 수 문자열 형식으로 입력
        String str = br.readLine();     
        
        int answer = 0;
        int index = 0;
        
        while(true) {
        	//정답변수 증가
            answer++;
            
            //문자열 형태로 변환
        	String num = Integer.toString(answer);
            
        	for(int i=0 ; i<num.length() ; i++) {
                //같은 숫자라면 인덱스 증가
        		if(num.charAt(i) == str.charAt(index)){
                    index++;
                }
        		
                //인덱스가 입력값과 같은 길이가 됐을 때
        		if(index == str.length()) {
                    //정답 출력
        			System.out.println(answer);
        			return;
        		}
        	}
        }
       
    }
}