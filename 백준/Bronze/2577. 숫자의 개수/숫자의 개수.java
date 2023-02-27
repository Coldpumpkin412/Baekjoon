import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		//A,B,C의 곱을 문자열로 변환
		String num = Integer.toString(A*B*C);
        
		//각 숫자의 출현 횟수 저장 배열
		int[] answer = new int[10];
		
		for(int i=0 ; i<num.length() ; i++) answer[num.charAt(i)-'0']++;
		
		for(int i=0 ; i<10 ; i++) System.out.println(answer[i]);
		
	}
}

	
