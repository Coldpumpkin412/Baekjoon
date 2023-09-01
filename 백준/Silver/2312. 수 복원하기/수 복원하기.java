import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
        //테스트케이스 T입력
		int T = Integer.parseInt(br.readLine());

		while(T-->0) {
			StringBuilder sb = new StringBuilder();
			
            int n = Integer.parseInt(br.readLine());

			for (int i=2 ; i<=n ; i++) {
				int cnt = 0;
                
				while(n%i==0) {
					n /= i;
					cnt++;
				}

				if (cnt != 0) {
					sb.append(i + " " + cnt + "\n");
				}
			}

			System.out.print(sb.toString());
		}
	}
}