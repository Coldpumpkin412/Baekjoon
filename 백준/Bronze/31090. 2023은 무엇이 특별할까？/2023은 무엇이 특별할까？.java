import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
        
		for(int i=0 ; i<N ; i++) {
			int year = sc.nextInt();
			
			if((year+1) % (year%100) == 0) {
				System.out.println("Good");
			}else {
				System.out.println("Bye");
			}
		}
	}
}