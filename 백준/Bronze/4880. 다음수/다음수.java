import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
		while(true) {
            //세 정수 입력
			st = new StringTokenizer(br.readLine());
			int A1 = Integer.parseInt(st.nextToken());
			int A2 = Integer.parseInt(st.nextToken());
			int A3 = Integer.parseInt(st.nextToken());
			
			//무한루프 종료
			if(A1==0 && A2==0 && A3==0) {
                break;
            }
			
			//값의 차를 저장
			int N = A2 - A1;
			int M = A3 - A2;
			
			String answer = (N==M) ? ("AP " + (A3+M)) : ("GP " + (A3 + (M*(M/N))));
			
			System.out.println(answer);
		}
		
	
	}

}