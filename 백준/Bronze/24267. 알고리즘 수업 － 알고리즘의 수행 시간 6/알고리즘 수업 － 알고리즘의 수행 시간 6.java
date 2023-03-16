import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		 * for문(반복문)이 3중으로 도는 것 확인.
		 * 각 입력값에 따라 6C3과 같다. 
		 */
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(n*(n-1)*(n-2)/6);
		System.out.println("3");
	}
}

	
