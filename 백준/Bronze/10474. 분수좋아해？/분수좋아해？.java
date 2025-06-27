import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
		while(true) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			//0 0 입력시 무한루프 종료
			if(A==0 && B==0) {
                break;
            }
			
			System.out.println((A/B) + " " + (A%B) + " / " + B);
		}
	}
}