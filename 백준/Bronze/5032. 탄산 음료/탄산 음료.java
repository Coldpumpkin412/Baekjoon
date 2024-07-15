import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //가지고 있는 빈병 수 E, 발견한 빈병 수 F, 새병으로 바꾸는데 필요한 빈병 수 C 입력
        st = new StringTokenizer(br.readLine());
		int E = Integer.parseInt(st.nextToken());	
		int F = Integer.parseInt(st.nextToken());	
		int C = Integer.parseInt(st.nextToken());	
		
        //총 가지고 있는 빈병
		int sum = E + F; 
               
		int answer = 0;
        
		while(sum >= C) {
            //현재 마실 수 있는 음료 수
			int remainder = sum/C;	
			answer += remainder;		
            
			sum = remainder + (sum%C); 
		}
		
		System.out.println(answer);
	}

}