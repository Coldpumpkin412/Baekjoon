import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //미터기에 표시된 거리 입력
		int N = Integer.parseInt(br.readLine());
                        
        //정답변수
		int answer = 0;
		
        int length = Integer.toString(N).length();
        
        //일종의 9진법 문제(4 기준)
		for(int i=0 ; i<length ; i++) {
            //N을 10으로 나눈 나머지
			int digit = N%10;
            
            //N 최신화
			N /= 10;
			
			if(digit > 4) {
                answer += (digit-1)*Math.pow(9, i);
            }else {
                answer += digit*Math.pow(9, i);
            }
		}
        
		System.out.println(answer);
	}
}