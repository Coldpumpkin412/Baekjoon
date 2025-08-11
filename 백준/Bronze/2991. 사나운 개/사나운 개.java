import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt(); 
		
		for(int i=0 ; i<3 ; i++) {
			int tmp = sc.nextInt();
			int answer = 0;
			
			if((tmp%(A+B) > 0) && (tmp%(A+B) <= A)) {
				answer++;
			}
			
			if((tmp%(C+D) > 0) && (tmp%(C+D) <= C)) { 
				answer++;
			}
			
			System.out.println(answer);
		}
        
	}
}