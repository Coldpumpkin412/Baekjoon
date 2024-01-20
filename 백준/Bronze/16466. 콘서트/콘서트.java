import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
        
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
        
		Arrays.sort(arr);
        
		int count = 0;
        
		for(int i=0 ; i<N ; i++) {
			if(arr[i] != i+1) {
				System.out.println(i+1);
				count ++ ;
				break;
			}
		}
        
		if(count == 0) {
			System.out.println(N+1);
		}
        
	}
}