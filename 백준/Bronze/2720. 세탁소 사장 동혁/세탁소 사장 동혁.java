import java.util.*;
import java.io.*;	

public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * 그리디 문제
		 * 가장 큰 금액부터 작은 금액 순으로 부여한다(쿼터 -> 페니)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//테스트케이스 개수
		int T = Integer.parseInt(br.readLine());
		
		//페니, 니켈, 다임, 쿼터
		int Penny = 1;
		int Nickel = 5;
		int Dime = 10;
		int Quarter = 25;
		
		while(T-->0) {
			int C = Integer.parseInt(br.readLine());
			
			sb.append(C/Quarter + " ");
			C %= Quarter;
			
			sb.append(C/Dime + " ");
			C %= Dime;
			
			sb.append(C/Nickel + " ");
			C %= Nickel;
			
			sb.append(C/Penny).append("\n");
		}
		
		System.out.println(sb);
	}
}

	
