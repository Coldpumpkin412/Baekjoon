import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N입력
		int N = Integer.parseInt(br.readLine());
        
		//숫자배열 선언 및 누적합에 활용할 배열 선언
		Long[] num = new Long[N + 1];
		Long[] sum = new Long[N + 1];
        
        //초기값 입력
		num[0] = 0L;
		sum[0] = 0L;
        
        st = new StringTokenizer(br.readLine());
		for (int i=1 ; i<=N ; i++) {
            //숫자 입력과 동시에 누적합에 넣어주기
			num[i] = Long.parseLong(st.nextToken());
            
		    sum[i] = num[i] + sum[i - 1];
		}
        
		Long answer = 0L;
        
        //결합법칙 활용하여 답 구해주기
		for (int i=2 ; i<=N ; i++) {
			answer += num[i] * sum[i-1];
		}
        
		System.out.println(answer);
    }
}	
