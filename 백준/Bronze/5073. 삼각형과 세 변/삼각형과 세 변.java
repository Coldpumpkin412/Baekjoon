import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			//세 변 입력
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			//가장 긴 변 찾기
			int max = Math.max(Math.max(A, B), C);
			
			//0,0,0이 입력되면 결과 출력 후 종료
			if(A==0 && B==0 && C==0) { 
				System.out.println(sb);
				break;
			}
			
			//가장 긴 변의 길이가 나머지 두 변의 길이의 합보다 긴 경우
			if(max >= A+B+C-max) {
				sb.append("Invalid\n");
				continue;
			}
			
			if(A==B && B==C && C==A) {
				sb.append("Equilateral\n");
				continue;
			}
			
			if(A==B || B==C || C==A) {
				sb.append("Isosceles\n");
				continue;
			}
			
			if(A!=B && B!=C && C!=A) {
				sb.append("Scalene\n");
				continue;
			}
			
		}
		
	}
}

	
