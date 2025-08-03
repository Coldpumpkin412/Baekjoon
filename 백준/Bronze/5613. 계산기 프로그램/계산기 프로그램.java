import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
		int answer = Integer.parseInt(br.readLine());
		
		while(true) {
			String S = br.readLine();
			
			//무한루프 종료
			if(S.equals("=")) {
                break;
            }
			
			int N = Integer.parseInt(br.readLine());
			
			if(S.equals("+")) {
				answer += N;
			}else if(S.equals("-")){
				answer -= N;
			}else if(S.equals("*")){
				answer *= N;
			}else{
				answer /= N;
			}
		}
        
		System.out.println(answer);
	}
}