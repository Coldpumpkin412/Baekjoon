import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();		
        
		while (true) {
            //str 입력
			String str = br.readLine();
            
			if(str == null) {
                break;
            }
		            
            //s, t 입력
			st = new StringTokenizer(str);
			String s = st.nextToken();
			String t = st.nextToken();

			int index = 0;

			for(int i=0 ; i<t.length() ; i++) {
				if(s.charAt(index) == t.charAt(i)) {
					index++;
				}
				if(index == s.length()) {
					break;
				}
			}

			if(index == s.length()) {
				sb.append("Yes").append('\n');
			}else {
				sb.append("No").append('\n');
			}

		}
        
		System.out.println(sb.toString());
	}
}