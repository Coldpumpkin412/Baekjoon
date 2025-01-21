import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 T 
		int T = Integer.parseInt(br.readLine());
        
        int index = 1;
		
		while(T-->0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			int N = Integer.parseInt(st.nextToken());
			
			String s = br.readLine();
			
			int num = 0;
                        
			for(int i=0 ; i<s.length()/2 ; i++) {
				if(s.charAt(i) != s.charAt(s.length()-i-1)) {
					num++;
				}
			}
			sb.append("Case #").append(index++).append(": ").append(Math.abs(N - num)).append("\n");
		}
        
		System.out.print(sb.toString());
	}
}