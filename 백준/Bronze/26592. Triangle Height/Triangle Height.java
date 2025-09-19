import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
        
		while(N-->0) {
			double A = sc.nextDouble();
			double B = sc.nextDouble();
            
			double H = 2 * A / B;
            
			System.out.println("The height of the triangle is " + String.format("%.2f", H) + " units");
		}
        
	}
}