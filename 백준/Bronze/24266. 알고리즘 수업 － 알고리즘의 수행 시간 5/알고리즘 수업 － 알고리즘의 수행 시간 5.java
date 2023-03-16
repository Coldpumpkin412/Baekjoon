import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		/*
		 * for문(반복문)이 3중으로 돌기 때문에 
		 * 입력값^3의 시간복잡도를 갖게된다
		 */
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println(n*n*n);
		System.out.println("3");
	}
}

	
