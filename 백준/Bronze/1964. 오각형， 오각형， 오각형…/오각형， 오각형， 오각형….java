import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] arr = new long[N+1];
        
		arr[1] = 5;
        
		for(int i=2 ; i<=N ; i++) {
			arr[i] = arr[i-1] + (5*i) + (1-(2*i));
		}
		
		System.out.println(arr[N] % 45678);
	}
}