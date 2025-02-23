import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("");
		System.out.printf("n e\n");
		System.out.printf("- -----------\n");
		System.out.printf("0 1\n");
		System.out.printf("1 2\n");
		System.out.printf("2 2.5\n");

		double fac = 2;
		double index = 2;
		double answer = 2.5;

		while(fac < 9) {
			fac++;
			index *= fac;
			answer += 1/index;
			System.out.printf("%.0f %.9f\n", fac, answer);
		}
        
		
	}
}