import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
        
		int sum = (a+c > p) ? a+c : p;
		
		System.out.println(Integer.toString(sum));
	}
}
