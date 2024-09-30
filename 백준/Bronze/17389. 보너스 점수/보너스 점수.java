import java.util.*;
import java.io.*;


public class Main {	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
        
		int answer = 0;
		int index = 0;
		
		for(int i=0 ; i<N ; i++) {			
			if(S.charAt(i) == 'O') {
				answer += i + index++ + 1;
			}else {				
				index = 0;
			}
		}
		
		System.out.println(answer);
		
	}
	
}