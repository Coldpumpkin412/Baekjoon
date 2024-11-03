import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력
		String N = br.readLine();
		int count = 0;
		int i = 1;
		
		//무한 루프
		while(true) {			
			int front = 1;
			int back = 1;
			
			if(N.length() == 1) {
                break;
            }
			
			//자릿수 값은 char형태이기 때문에 - '0'을 해준다.
			for(int j=0 ; j<i ; j++) {
				front *= N.charAt(j) - '0';
			}
			
			for(int j=i ; j<N.length() ; j++) {
				back *= N.charAt(j) - '0';
			}
			
			if(front == back) {
				count = 1;
				break;
			}
			
			if(i == N.length()-1) {
                break;
            }
			
			i++;
			
		}
		System.out.println((count==1) ? "YES" : "NO");
	}

}