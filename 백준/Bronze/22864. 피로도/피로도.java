import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
        //a, b, c, m 입력
        st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int count = 0; 
        int p = 0; 
        int answer = 0;
        
		while(count != 24) {
			if(a+p <= m) {
				answer += b;
				p += a;
			}else {
				p = p-c<0 ? 0 : p-c;
			}
            
			count++;
		}
		System.out.print(answer);
	}
}