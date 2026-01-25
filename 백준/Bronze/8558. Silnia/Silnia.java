import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
        
        int index = 1;
        
		for(int i=1 ; i<=N ; i++) {
			index *= i;
			index %= 10;
		}
		
		System.out.println(index);
	}
}