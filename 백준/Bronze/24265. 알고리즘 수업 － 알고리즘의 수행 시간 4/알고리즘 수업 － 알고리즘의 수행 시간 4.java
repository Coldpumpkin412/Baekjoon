import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		 * 해당 반복문을 해석해보면
		 * i=1 일 때, j=2~n까지 (n-1)번 반복
		 * i=2 일 때, j=3~n까지 (n-2)번 반복
		 * i=3 일 떄, j=4~n까지 (n-3)번 반복
		 * ...
		 * i=n-1 일 때, j=n-1~n까지 1번 반복
		 * 
		 * 즉, 입력값 n에 대해 수행횟수는 1+2+...+(n-1)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(n*(n-1) / 2);
		System.out.println("2");
	}
}

	
