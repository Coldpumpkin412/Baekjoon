import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<Integer>();
				
		for(int i=1 ; i<=N ; i++) {
			int t = Integer.parseInt(br.readLine());
			
			for(int j=0 ; j<t ; j++) {
				list.add(i);
			}
		}
		
		for(int i=0 ; i<Q ; i++) {
			int num = Integer.parseInt(br.readLine());
            
			sb.append(list.get(num)).append("\n");
		}
        
		System.out.println(sb.toString());
	}
}