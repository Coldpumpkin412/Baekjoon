import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		        
        int[][] room = new int[2][7];
		int count = 0 ;
        
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
            
			room[s][g]++;			
		}
		
		for(int i=0 ; i<2 ; i ++) {
			for(int j=1 ; j<7 ; j++) {
				count += room[i][j] / K ;
                
				if(room[i][j]% K != 0) {
					count++;
				}
			}
		}
        
		System.out.print(count);
	}
}