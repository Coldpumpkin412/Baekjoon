import java.util.*;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pizza = 1;
		double num = 0;
		
		while(true) {
			double r = sc.nextDouble();
			
			if(r==0) {
				break;
			}
			
			double w = sc.nextDouble();
			double l = sc.nextDouble();
			
			num = Math.pow(w/2,2) + Math.pow(l/2,2);
			
			if(Math.pow(r,2) >= num) {
				System.out.println("Pizza " + pizza + " fits on the table.");
			}else {
				System.out.println("Pizza " + pizza + " does not fit on the table.");
			}
			pizza += 1;
		}
    }
}