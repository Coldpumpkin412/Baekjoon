import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();	
		int K = sc.nextInt();	
		
		double num = Math.pow(10, K);	// 10의 K제곱
		
		int answer = (int)((int)Math.round(C/num) * num);
		
		System.out.println(answer);
				
	}

}