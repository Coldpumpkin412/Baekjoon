import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		
		//초기값 1로 설정
		int answer = 1;
		
		for(int i=0 ; i<N ; i++) {
			answer += sc.nextInt();
		}
		
		//멀티탭 꽂은 수 만큼 빼주고 출력
		System.out.println(answer-N);
	}
}

	
