import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A+B+C != 180) {
			System.out.println("Error");
			return;
		}
		
		if(A==B && B==C && C==60) {
			System.out.println("Equilateral");
			return;
		}
		
		if(A+B+C==180 && (A==B || B==C || C==A)) {
			System.out.println("Isosceles");
			return;
		}else {
			System.out.println("Scalene");
			return;
		}
		
	}
}

	
