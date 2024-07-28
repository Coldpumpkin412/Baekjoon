import java.util.*;

public class Main {

	static boolean View[][] = new boolean[2001][2001];
    
    //유클리드 호제법 활용 최대공약수 구하는 메소드
	static int GCD(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int D1 = sc.nextInt();
		int D2 = sc.nextInt();
        
		long answer = 0;
        
		for(int i=D1 ; i<=D2 ; i++) {
			for(int j=1 ; j<=i ; j++) {
                
				int gcd = GCD(i, j);
                
				if(View[i/gcd][j/gcd]) {
                    continue;
                }
					
				answer++;
                
				View[i/gcd][j/gcd] = true;
			}

		}
		System.out.println(answer);

	}
}