import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int I = Integer.parseInt(st.nextToken());
		
        System.out.println(String.valueOf(A*(I-1)+1));
	}
}