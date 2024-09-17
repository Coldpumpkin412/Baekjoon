import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        //N 입력
		int N = Integer.parseInt(br.readLine());
		
		
		sb.append(N*(N-1) / 2).append("\n");
		
		int num = 1;
        
		for(int i=0 ; i<N ; i++) {
			sb.append(num).append(" "); 
            
			num *= 2;
		}
		
		sb.append("\n").append(N-1).append("\n");
        
		num = 1;
		
		for(int i=0 ; i<N ; i++) {
			sb.append(num).append(" ");
			num++;
		}
		
		System.out.println(sb.toString());
	}
}
