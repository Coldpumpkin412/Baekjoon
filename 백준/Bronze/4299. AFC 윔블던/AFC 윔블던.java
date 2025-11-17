import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if((A+B)%2 != 0 || A<B) {
			System.out.println(-1);
		}else {
			System.out.println(((A+B)/2) + " " + (((A+B)/2)-B));
		}
	}

}