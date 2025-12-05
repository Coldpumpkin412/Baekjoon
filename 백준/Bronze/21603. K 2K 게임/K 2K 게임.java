import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<>();
        
		for(int i=1 ; i<=N; i++) {
			if(K%10 != i%10 && 2*K%10 != i%10) {
				list.add(i);
			}
		}
		
		
		sb.append(list.size()).append("\n");
        
		for(int num : list) {
			sb.append(num).append(" ");
		}
        
		System.out.print(sb.toString());
	}
}