import java.util.Scanner;

public class Main {
	public static boolean arr[]; //소수 저장 배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum=0;
		int min = Integer.MAX_VALUE; //정수형의 최대값
		
		arr = new boolean[N+1]; //0부터 N까지 배열
		prime(); 
		
		for(int i=M ; i<=N ; i++) {
			if(arr[i] == true) continue;
			else {
				sum += i;
				if(min == Integer.MAX_VALUE) min = i; //첫 소수가 최소
			}
		}
		if(sum == 0) System.out.println(-1); //소수가 없다면 -1 출력
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	
	//에라토스테네스의 체 알고리즘 사용하여 소수 판별
	public static void prime() {
		arr[0] = true;
		arr[1] = true;
		
		for(int i=2 ; i<Math.sqrt(arr.length) ; i++) {
			for(int j=i*i ; j<arr.length ; j=j+i) {
				arr[j] = true;
			}
		}
	}
}
