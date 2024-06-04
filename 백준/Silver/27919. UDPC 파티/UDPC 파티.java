import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int cuCnt = 0;
		int dpCnt = 0;
		
		for(int i=0 ; i<str.length() ; i++) {
			String s = str.substring(i, i+1);
			
			if(s.equals("C") || s.equals("U")) {
				cuCnt++;
			} else if(s.equals("D") || s.equals("P")) {
				dpCnt++;
			}
		}
		
		String answer = "";
		
		//CU 채택
		if(cuCnt > ((dpCnt + 1) / 2)) {
			answer += "U";
		}
		
		//DP가 채택
		if(dpCnt > 0) {
			answer += "DP";
		}
		
		System.out.println(answer);
	}
}