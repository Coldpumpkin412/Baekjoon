import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * 1번부터 N번까지 배수를 진행했을 때, 열려있는 창문들은 제곱수들이다.
		 * 즉, N이하의 제곱수들을 찾는 문제(1,4,9, ... )
		 */
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 1;
		int answer = 0;
		
		while(count*count<=N) {
			answer++;
			count++;
		}
		
		System.out.println(answer);
	}
}

	
