import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        //N 입력
		int N = Integer.parseInt(br.readLine());
		
        //초기값 설정
		int x = 1;
		int result = N;
		
		while(N > 0) {
            //반올림 값
			result = (int)((result / (double)x) + 0.5) * x;
            
			x *= 10;
			N /= 10;
		}
		
		System.out.println(result);
	}
}