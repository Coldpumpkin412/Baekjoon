import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
        
		int i = 0;
		
		st = new StringTokenizer(br.readLine());
		for(i=0 ; i<N ; i++) {
			T -= Integer.parseInt(st.nextToken());
            
			if(T < 0) {
				break;
			}
		}
        
		System.out.println(i);
	}
}