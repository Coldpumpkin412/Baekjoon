import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int N = Integer.parseInt(br.readLine());
        
		int Q1 = 0;
        int Q2 = 0;
        int Q3 = 0;
        int Q4 = 0;
        int AXIS = 0;
		
		while(N-->0) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
						
			if(x==0 || y==0) {
				AXIS++;
			}else if(x > 0) {
				
				if(y > 0) {
					Q1++;
				}else {
					Q4++;
				}
                
			}else if(x < 0) {
				if(y > 0) {
					Q2++;
				}else {
					Q3++;
				}
			}
		}
        
		System.out.println("Q1: " + Q1);
		System.out.println("Q2: " + Q2);
		System.out.println("Q3: " + Q3);
		System.out.println("Q4: " + Q4);
		System.out.println("AXIS: " + AXIS);
        
	}
}