import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        		
		int K = Integer.parseInt(br.readLine());
        
		String str = br.readLine();        		
        
		for(int i=0 ; i<K ; i++) {
            for(int j=0 ; j<str.length()/K ; j++) {
                //삼항연산자 활용
                sb.append(str.charAt(j%2==0 ? j*K+i : j*K+K-1-i));
            }
        }
		System.out.println(sb);
	}
}