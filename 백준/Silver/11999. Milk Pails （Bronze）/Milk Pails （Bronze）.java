import java.util.*;
import java.io.*;

 
public class Main{ 
 
 	public static void main(String[] args) throws IOException {
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		StringTokenizer st;
            
        st = new StringTokenizer(br.readLine());
 		int X = Integer.parseInt(st.nextToken());
 		int Y = Integer.parseInt(st.nextToken());
 		int M = Integer.parseInt(st.nextToken());
 
 		int q = M / X;
 
 		int result = X * q--;
 
 		int cnt = 1;
        
 		while(cnt <= M / Y) {
 			int tmp = X * q--;
            
 			if(tmp + (Y*cnt) <= M) {
 				tmp += (Y*cnt++);
 			}
            
 			result = Math.max(result, tmp);
 		}
        
 		System.out.println(result);
 	}
}