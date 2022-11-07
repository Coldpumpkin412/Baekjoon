import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		int hun_A = A/100; //A의 백의자리
		int hun_B = B/100; //B의 백의자리
		
		int ten_A = (A/10)%10; //A의 십의자리
		int ten_B = (B/10)%10; //B의 십의자리
		
		int one_A = A%10; //A의 일의자리
		int one_B = B%10; //B의 일의자리
		
		A = one_A*100 + ten_A*10 + hun_A;
		B = one_B*100 + ten_B*10 + hun_B;
		
		System.out.print(Math.max(A, B));
		
	}

}
