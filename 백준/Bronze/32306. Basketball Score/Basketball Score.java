import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] A = new int[3];
		int[] B = new int[3];
        
		int team1 = 0;
		int team2 = 0;
		
		for(int i=0 ; i<A.length ; i++) {
			A[i] = sc.nextInt();
            team1 += A[i] * (i+1);
		}
		
		for(int i=0 ; i<B.length; i++) {
			B[i] = sc.nextInt();
            team2 += B[i] * (i+1);
		}
		
		
		if(team1 > team2) {
			System.out.println("1");
		}else if(team1 < team2) {
			System.out.println("2");
		}else {
			System.out.println("0");
		}
		
	}
}