import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
                
        //N, M 입력
        st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());
        
		long answer = 1;
		
		// m이 n보다 작거나 같은 경우
		if(M <= N) { 
			answer = 0;
		}else {
			for(long i=N ; i>0 ; i--) {
				answer *= i;
				answer %= M;
				 
				if(answer == 0) { 
					break;
				}
			}
		}
		
		System.out.println(Long.toString(answer));
	}
}
