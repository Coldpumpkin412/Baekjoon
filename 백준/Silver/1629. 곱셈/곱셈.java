import java.util.*;
import java.io.*;

public class Main {
    
    //pow함수
	static long pow(int A, int B, int mod) {
		//재귀적으로 호출하다가 지수가 0이 될 때
		if(B==0) return 1;

		long val = pow(A, B/2, mod);
		
		//지수가 짝수인 경우
		if(B%2==0) {
			return val * val % mod;
		}else {//지수가 홀수인 경우
			return (val * val % mod) * A % mod;
		}
	}
    
    public static void main(String[] args) {
		/*
		 * 지수법칙 및 모듈러 성질 활용
		 * -지수법칙 : A^(m+m) = A^n * A^m
		 * -모듈러법칙 : (AxB)modC = (AmodC x BmodC)modC
		 */
    	Scanner sc = new Scanner(System.in);
    	
    	//A, B, C 입력
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	
        //정답 출력
    	System.out.println(pow(A, B, C));
    }
}	
