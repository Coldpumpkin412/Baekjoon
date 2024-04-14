import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		long arr[] = new long[N];
        
		String str = "";
        String tmp = "";

		while(N > 0) {
			while (st.hasMoreTokens()) {
				str = st.nextToken();
                
				tmp = "";
                
				for(int i=str.length()-1 ; i>=0 ; i--) {
					tmp += str.charAt(i);
				}
                
				arr[--N] = Long.parseLong(tmp);
			}
			if(N > 0) {
                st = new StringTokenizer(br.readLine());                
            }
		}
        
		Arrays.sort(arr);
        
		for(int i=0 ; i<arr.length ; i++) {
            sb.append(arr[i]+"\n");
		}
		
        System.out.println(sb.toString());
	}
}