import java.util.*;
import java.io.*;

public class Main {
	public static long factorial(long n) {
		if(n==1) return 1;
		
		else return n * factorial(n-1);
	}
    
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
        
		//N이 20까지이므로 팩토리얼의 경우 int형 범위 벗어남
		long N = sc.nextLong();
		
		if(N==0) System.out.println("1");
		else {
			System.out.println(factorial(N));
		}

	}
}

	
