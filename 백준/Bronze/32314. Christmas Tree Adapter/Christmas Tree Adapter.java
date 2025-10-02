import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int W = sc.nextInt();
		int V = sc.nextInt();
		
		if(A <= W/V) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
        
	}
}