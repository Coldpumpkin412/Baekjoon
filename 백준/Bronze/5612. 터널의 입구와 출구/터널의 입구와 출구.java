import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //조사시간 N, 차량 수 M 입력
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
        
        //최댓값
		int max = M;
		
		for(int i=0 ; i<N ; i++) {
            
            //입구 통과한 차 수 A, 출구 통과한 차 수 B 입력
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			M += A;
			M -= B;
            
            //최댓값 갱신
			max = Math.max(max, M);
            
			if(M < 0) {
				max = 0;
				break;
			}
		}
        
		System.out.println(max);
	}
}