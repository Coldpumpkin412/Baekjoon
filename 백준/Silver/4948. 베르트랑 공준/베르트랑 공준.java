import java.util.Scanner;

public class Main { //베르트랑 공준 명제
	
	public static boolean prime[]; //

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		prime = new boolean[246913]; //n은 123456 까지이므로 2n은 최대246912
		
		while(true) {
			int n = sc.nextInt();
			int count = 0; //소수의 개수 카운트

			if(n==0) break;
			else {
				get_prime();
				for(int i=n+1 ; i<=2*n ; i++) {
					if(prime[i] == false) count++;
					else continue;
				}
			}
			System.out.println(count);
		}
	
	}
	
	//에라토스테네스의 체 활용
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2 ; i<Math.sqrt(prime.length) ;i++) {
			for(int j=i*i ; j<prime.length ; j+=i) {
				prime[j] = true;
			}
		}
	}
}