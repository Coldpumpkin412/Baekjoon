import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		int T = Integer.parseInt(br.readLine());
        
		int[] arr = new int[3];
		
		for(int i=1 ; i<=T ; i++) {
			st = new StringTokenizer(br.readLine());
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			
			//정렬
			Arrays.sort(arr);
			
			System.out.print("Case #" + i + ": ");
			
			if(arr[0]+arr[1] <= arr[2]) {
				System.out.println("invalid!");
			}else if(arr[0]==arr[1] && arr[1]==arr[2]) {
				System.out.println("equilateral");
			}else if(arr[0]==arr[1] || arr[1]==arr[2]) {
				System.out.println("isosceles");
			}else {
				System.out.println("scalene");
			}
		}
	}

}