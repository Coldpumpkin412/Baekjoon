import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
        //n입력 및 배열 선언
		int n = Integer.parseInt(br.readLine());
		int nums[] = new int[n];
        
        //숫자입력
		for (int i=0 ; i<n ; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(nums);

		for (int i=0 ; i<n ; i++) {
			sb.append(nums[i]).append("\n");
		}
		
		System.out.println(sb);
	}
}