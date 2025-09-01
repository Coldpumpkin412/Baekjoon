import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int T = sc.nextInt();
        
		int[] first  = new int[] {500, 300, 300, 200, 200, 
                                  200, 50, 50, 50, 50, 30, 
                                  30, 30, 30, 30, 10, 
                                  10, 10, 10, 10, 10};
		int[] second = new int[] {512, 256, 256, 128, 128, 
                                  128, 128, 64, 64, 64,
                                  64, 64, 64, 64, 64, 
				                  32, 32, 32, 32, 32, 
                                  32, 32, 32, 32, 32, 
                                  32, 32, 32, 32, 32, 32};
        
		while(T-->0) {
			int money = 0;
            
			int A = sc.nextInt();
			int B = sc.nextInt();
            
			if(A>0 && A<= 21){
                money += first[A-1];
            }
				
			if(0<B && B<=31){
                money += second[B-1];
            }
				
			
			System.out.println(money * 10000);
		}
		
	}
}