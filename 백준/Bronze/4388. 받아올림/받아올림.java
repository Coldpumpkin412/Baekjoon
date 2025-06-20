import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(a!=0 || b!=0) {
			int count = 0;
			int sum = 0;
            
			while(a!=0 || b!=0) {
				sum = (sum/10) + (a%10) + (b%10);
                
				if(sum>=10) {
					count++;
				}
                
				a = a/10;
				b = b/10;
			}
            
			System.out.println(count);
            
			a = sc.nextInt();
			b = sc.nextInt();
		}
	}
}