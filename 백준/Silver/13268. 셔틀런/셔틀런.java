import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //지훈이 달릴 수 있는 거리 입력
		int N = Integer.parseInt(br.readLine()); // 지훈이의 체력
        
		int answer = 0;
		
		N %= 100;
		
		if(N==0 || N==10 || N==30 || N==60) {
			answer = 0;
		}else if ((0<N && N<10) || (10<N && N<=15) || (25<=N && N<30) || (30<N && N<=35) || (55<=N && N<60) || (60<N && N<=65) || (95<=N && N<100)) {
			answer = 1;
		}else if ((15<N && N<25) || (35<N && N<=40) || (50<=N && N<55) || (65<N && N<=70) || (90<=N && N<95)) {
			answer = 2;
		}else if ((40<N && N<50) || (70<N && N<=75) || (85<=N && N<90)) {
			answer = 3;
		}else {
			answer = 4;
		}
		
        System.out.println(answer);
	}
}