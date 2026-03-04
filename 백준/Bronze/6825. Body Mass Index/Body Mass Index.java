import java.util.*;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		double W = sc.nextDouble();
		double H = sc.nextDouble();
        
		double BMI = W / (H*H);
		
		if(BMI > 25) {
			System.out.println("Overweight");
		}else if(18.5 <= BMI && BMI <= 25) {
			System.out.println("Normal weight");
		}else {
			System.out.println("Underweight");
		}
        
	}
}