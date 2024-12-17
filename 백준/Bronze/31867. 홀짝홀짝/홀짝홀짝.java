import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 및 K 입력 후 배열에 넣기
		int N = Integer.parseInt(br.readLine()); 
		char[] K = br.readLine().toCharArray(); 
		
		int even = 0;
		int odd = 0;
		
		for(int i=0 ; i<N ; i++) {
			int num = K[i] - '0';
			
			if(num%2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		
		int answer = -1;
        
        //짝짝수
		if(even > odd) { 
			answer = 0;
		}else if(even < odd) { //홀홀수
			answer = 1;
		}
		
		System.out.println(answer);
	}
}
