import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int f = (H-1)/(N+1)+1; 
		int s = (W-1)/(M+1)+1;
		
		System.out.println(((H-1)/(N+1)+1)*((W-1)/(M+1)+1));
	}
	
}
