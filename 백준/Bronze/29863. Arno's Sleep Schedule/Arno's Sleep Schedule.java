import java.util.*;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(20<=A && A<=23) {
			System.out.println(24 - A + B);
		}else {
			System.out.println(B - A);
		}
        
	}
}