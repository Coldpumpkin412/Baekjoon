import java.util.Scanner;

public class Main {
	
	public static boolean prime[]; //소수 저장할 배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		prime = new boolean[N+1]; //N까지의 소수 저장 배열
		get_prime(); //소수 판별 메소드
		
		for(int i=M ; i<=N ; i++) {
			if(prime[i] == false) System.out.println(i);
		}
	}
	
	//에라토스테네스의 체를 활용한 소수 판별
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2 ; i<Math.sqrt(prime.length) ; i++) {
			for(int j=i*i ; j<prime.length ; j += i) {
				prime[j] = true;
			}
		}
	}
}