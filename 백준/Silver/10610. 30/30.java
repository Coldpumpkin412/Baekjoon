import java.util.*;
import java.io.*;


public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
		String str = br.readLine();
		int sum = 0;

		//숫자 재배치(오름차순)
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		int len = charArr.length;

		
		//맨 끝 부터 탐색 후 붙여주기
		for(int i=len-1 ; i>=0 ; i--) {
			int num = charArr[i] - '0';
			sum += num;
			sb.append(num);
		}
				
		//30의 배수인지 판단 후 아니라면
		if(charArr[0]!='0' || sum%3!=0) {
			System.out.println(-1);
			return;
		}
		
		System.out.println(sb.toString());
	}
}