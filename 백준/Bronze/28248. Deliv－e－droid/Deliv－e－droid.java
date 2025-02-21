import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
        
		int answer = 50*A - 10*B;
		
		if(A > B) {
			answer += 500;
		}
		
		System.out.println(answer);
	}
}