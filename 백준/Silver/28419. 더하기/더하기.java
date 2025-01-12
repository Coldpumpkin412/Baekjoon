import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //수열 길이 N 입력
		int N = Integer.parseInt(br.readLine()); 
		
		//짝수 합
		long even = 0;
		
		//홀수 합
		long odd = 0;
		
        //값 입력
        st = new StringTokenizer(br.readLine());
		for(int i=1 ; i<=N ; i++) {
			if(i%2 == 0) {
				even += Long.parseLong(st.nextToken());
			} else {
				odd += Long.parseLong(st.nextToken());
			}
		}
		
		long count = 0;
		
		if(N==3 && even<odd) {
			count = -1;
		}else {
			if(even > odd) {
				count = even - odd;
			}else {
				count = odd - even;
			}
		}
		
        System.out.println(count);		
	}
}