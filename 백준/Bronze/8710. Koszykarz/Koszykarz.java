import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int K = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();        		
		
		int count = (M-K) / L;
		
		if((M-K)%L != 0) {
			count++;
		}
        
		System.out.println(count);
	}
}