import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int N = Integer.parseInt(br.readLine());
			
			for(int i=1 ; i<=N ; i++) {
				for(int j=1 ; j<=N ; j++) {
					
					if(i==1 || i==N) {
						System.out.print("#");
					}else {
						if(j==1 || j==N) {
							System.out.print("#");
						}else {
							System.out.print("J");
						}
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}