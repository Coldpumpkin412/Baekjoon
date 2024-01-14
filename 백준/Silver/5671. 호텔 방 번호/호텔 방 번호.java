import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
		int[] arr = new int[5001];
        
		for(int i=1 ; i<=5000 ; i++) {
			boolean[] check = new boolean[10];
			int T = i;
            
			while(true) {
				if(T == 0) {
					arr[i] = 1;
					break;
				}
				if(check[T%10]){
                  break;  
                } 
                
				check[T%10] = true;
				
                T /= 10;
			}
		}
		for(int i=2 ; i<=5000 ;i++){
            arr[i] += arr[i-1];  
        } 
        
        String str;
        
		while((str=br.readLine())!=null) {
			st = new StringTokenizer(str);
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
            
			sb.append((arr[M]-arr[N-1]) + "\n");
		}
        
		System.out.println(sb);
	}
}