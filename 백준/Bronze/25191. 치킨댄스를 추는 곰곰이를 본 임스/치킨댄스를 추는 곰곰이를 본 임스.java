import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
        
		int count = 0;
		
		count += A/2;
		count += B;
		
		if(N > count) {
			System.out.println(count);
		}else {
			System.out.println(N);
		}
        
	}
}