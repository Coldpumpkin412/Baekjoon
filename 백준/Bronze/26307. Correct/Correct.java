import java.util.*;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H == 9) {
			System.out.println(M);
		}else {
			System.out.println((H-9)*60 + M);
		}
		
	}
}