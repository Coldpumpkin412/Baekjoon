import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int T = Integer.parseInt(br.readLine());
        
		while(T-->0) {
			int N = Integer.parseInt(br.readLine());
			int max = -1000001;
			int min = 1000001;
            
			st = new StringTokenizer(br.readLine());
			for (int i=0 ; i<N ; i++) {
				int num = Integer.parseInt(st.nextToken());
				max = Math.max(max, num);
				min = Math.min(min, num);
			}
			System.out.println(min + " " + max);
		}
	}

}