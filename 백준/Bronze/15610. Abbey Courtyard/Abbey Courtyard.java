import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		double answer = Math.sqrt(a);
        
		answer *= 4;
		
		System.out.println(answer);
	}
}
