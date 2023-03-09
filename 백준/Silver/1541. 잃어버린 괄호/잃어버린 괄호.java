import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		 * 1. '-'(뺄셈)을 기준으로 분리
		 * 2. '+'(덧셈)을 기준으로 분리 후 더해준다
		 * 3. 맨 첫 묶음은 더해주고 나머지는 빼준다
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] subtract = br.readLine().split("-");
		
		int num = 0;
		
		for(int i=0 ; i<subtract.length ;i++) {
			int sum = 0;
			
			String[] plus = subtract[i].split("\\+");
			for(int j=0 ; j<plus.length ; j++) {
				sum += Integer.parseInt(plus[j]);
			}
			if(i==0) num += sum;
			else num-= sum;
		}
		
		System.out.println(num);
	}
}

	
