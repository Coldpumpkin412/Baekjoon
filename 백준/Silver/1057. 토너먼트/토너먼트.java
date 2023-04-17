import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		//단순한 수학문제. 규칙을 찾은 후 공식화 하여 대입해주기
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		int JIMIN = sc.nextInt();
		int HANSU = sc.nextInt();
		
		int answer = 0;
		
		//지민과 한수가 같을때까지
		while(JIMIN != HANSU) {
			JIMIN = JIMIN/2 + JIMIN%2;
			HANSU = HANSU/2 + HANSU%2;
			
			answer++;
		}
		
		System.out.println(answer);
	}
}

	
