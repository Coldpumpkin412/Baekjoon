import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        while(N-->0) {
        	st = new StringTokenizer(br.readLine());
        	
        	sb.append("god");
        	st.nextToken();
            
        	while(st.hasMoreTokens()) {
        		sb.append(st.nextToken());
        	}
        	sb.append("\n");
        }
        
        System.out.print(sb.toString());
	}
}