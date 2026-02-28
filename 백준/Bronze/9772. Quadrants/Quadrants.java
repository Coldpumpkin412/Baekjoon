import java.util.*;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			double A = sc.nextDouble();
			double B = sc.nextDouble();
            
			if(A>0 && B>0) {
				System.out.println("Q1");
			}else if(A<0 && B>0) {
				System.out.println("Q2");
			}else if(A<0 && B<0) {
				System.out.println("Q3");
			}else if(A>0 && B<0) {
				System.out.println("Q4");
			}else if(A==0 || B==0) {
				System.out.println("AXIS");
			}
		}
		sc.close();
	}
}