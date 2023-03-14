import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//N, K 입력
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		//약수 저장 변수 및 몇 번째인지 저장하는 변수 선언
		int divisor=0;
		int count=0;
		
		for(int i=1 ; i<=N ; i++) {
			//약수라면 count++
			if(N%i == 0) count++;
			
			if(count == K) {
				divisor = i;
				break;
			}
		}
		System.out.println(divisor);
		
	}
}

	
