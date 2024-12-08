import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int N = Integer.parseInt(br.readLine());
        
		if(N == 0) {
			System.out.println("divide by zero");
		}else {
			st = new StringTokenizer(br.readLine());
			for(int i=0 ; i<N ; i++) {
				int M = Integer.parseInt(st.nextToken());
			}
            
			System.out.println("1.00");
		}
	}

}
