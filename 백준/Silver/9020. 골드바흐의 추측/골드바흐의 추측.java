import java.util.Scanner;

public class Main { //골드바흐의 추측
	
	public static boolean prime[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); //테스트케이스 개수
		
		for(int i=0 ; i<T ; i++) {
			int n = sc.nextInt(); //짝수 n입력
			prime = new boolean[10001]; //n은 10000까지 이므로 범위 생성
			get_prime(); //소수판별 함수
			
			//두 수의 차이를 구하기 떄문에 주어진 수의 절반을 기준으로
			//한쪽은 1씩 감소하며, 다른쪽은 1씩 증가하며 비교해간다.
			int first = n/2;
			int second = n/2;    
			while(true) {
				if(prime[first] == false && prime[second] == false){
					System.out.println(first+" "+second);
					break;
				}
				first--; 
				second++;
			}
		}
	}
	
	//에라토스테네스의 체 활용하여 소수 판별함수 작성
	public static void get_prime() {
		prime[0] = prime[1] = true;
		
		for(int i=2 ; i<Math.sqrt(prime.length) ; i++) {
			for(int j=i*i ; j<prime.length ; j+=i) {
				prime[j] = true;
			}
		}
	}

}
