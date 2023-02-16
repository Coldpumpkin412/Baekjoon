import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt(); 
		
		//이항계수 : n! / k! * (n-k)!
		 
		System.out.println(factorial(N) / (factorial(K) * factorial(N-K)));
		
	}
    
    //재귀함수를 활용한 팩토리얼 구현
	public static int factorial(int num) {
		if(num<=1) return 1;
		else return num * factorial(num-1);
	}
}

	
