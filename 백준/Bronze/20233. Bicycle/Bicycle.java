import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int X = sc.nextInt();
		int B = sc.nextInt();
		int Y = sc.nextInt();
		int T = sc.nextInt();
        
		int sum_A = 0; 
        int sum_B = 0;
		
		if(T <= 30) {
			sum_A = A;
		}else {
			sum_A = A + (T-30) * X * 21;
		}
		
		if(T <= 45) {
			sum_B = B;
		}else {
			sum_B = B + (T-45) * Y * 21;
		}
		
		System.out.println(sum_A + " " + sum_B);		
	}
}