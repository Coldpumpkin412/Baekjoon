import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
        
		while(N-->0) {
			int M = Integer.parseInt(br.readLine());
            
			String[] str = br.readLine().split(" ");
            
			int[] arr = new int[str.length];
            
			for(int i=0 ; i<M ; i++){
                arr[i] = Integer.parseInt(str[i]);
            }
				
			Arrays.sort(arr);
            
			System.out.println((arr[arr.length-1]-arr[0]) * 2);
		}
	}
}