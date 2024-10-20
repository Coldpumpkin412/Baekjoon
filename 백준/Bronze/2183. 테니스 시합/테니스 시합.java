import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //N, S 입력
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
        String S = st.nextToken();
        
		sb.append(S);
        
		System.out.println(sb.charAt(sb.length()-1));
	}
}