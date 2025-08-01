import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int S = sc.nextInt();
        
		boolean check = false;
		
		for(int i=0 ; i<N ; i++) {
			int C = sc.nextInt();
			int P = sc.nextInt();
            
			if(X>=C && P>S) {
				check = true;
			}
		}
		
		if(check) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}