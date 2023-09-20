import java.util.*;
import java.io.*;

public class Main {
	//피보나치 수열을 저장할 해시맵 선언(key : n, value : 피보나치 수)
	public static Map<Long, Long> map = new HashMap<>();
	
	//모듈러연산에 활용할 수
	public static long mod = 1000000007;
	
	public static long fibonacci(long index) {
		//해시맵에 이미 인덱스가 있는경우
		if(map.containsKey(index)) {
			return map.get(index);
		}else if(index%2 == 0){//인덱스가 짝수인 경우
			long n = index/2;
			
			long fib1 = fibonacci(n-1);
			long fib2 = fibonacci(n);
			
			//점화식
			long fibo = (2*fib1 + fib2) * fib2;
			
			//모듈러
			fibo = fibo % mod;
			
			//해시맵에 넣어주기
			map.put(index, fibo);
			
			return fibo;
		}else {//인덱스가 홀수인 경우
			long n = (index+1)/2;
			
			long fib1 = fibonacci(n-1);
			long fib2 = fibonacci(n);
			
			//점화식
			long fibo = fib1*fib1 + fib2*fib2;
			
			//모듈러
			fibo = fibo % mod;
			
			//해시맵에 넣어주기
			map.put(index, fibo);
			
			return fibo;
		}
	}
	
    public static void main(String[] args) throws IOException{
    	/*
    	 * 피보나치 수열에관한 행렬식 활용하기
    	 * <짝수인경우> F2n = (2Fn-1 + Fn) * Fn
    	 * <홀수인경우> F2n-1 = Fn-1^2 +Fn^2
    	 */
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//구하고자하는 피보나치 수 N 입력
    	long N = Long.parseLong(br.readLine());
    	
    	//초기값 해시맵에 넣어주기
    	map.put((long) 0, (long) 0);
    	map.put((long) 1, (long) 1);
    	map.put((long) 2, (long) 1);
    	map.put((long) 3, (long) 2);
    	
    	long answer = fibonacci(N);
    	
    	System.out.println(String.valueOf(answer));
    }
}	
