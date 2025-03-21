import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int N = Integer.parseInt(br.readLine());

		int num = 1;
		
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			int X =Integer.parseInt(st.nextToken());
			int Y =Integer.parseInt(st.nextToken());
			
			if(X == num) {
				num = Y;
			}else if(Y == num){
				num = X;
			}
		}
		
		System.out.println(num);
	}

}