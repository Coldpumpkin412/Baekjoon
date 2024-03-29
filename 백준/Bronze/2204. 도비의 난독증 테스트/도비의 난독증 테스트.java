import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
                break;
            }				
			
			String[] arr = new String[n];
			
			for(int i=0 ; i<n ; i++) {
				arr[i] = br.readLine().trim();
			}
			
			Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
            
			System.out.println(arr[0]);
		}
	}
}