import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
        A = Math.abs(A);
        B = Math.abs(B);
        
        if(A+B <= C) {
          if((A+B)%2==0 && C%2==0) {
              System.out.println("YES");
          }else if((A+B)%2!=0 && C%2 != 0) {
              System.out.println("YES");
          }else {
              System.out.println("NO");
          }
        }else {
            System.out.println("NO");
        }
	}

}