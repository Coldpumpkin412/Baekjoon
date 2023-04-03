import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//최댓값 및 최솟값
		int max = 2;
		int min = 1000000;
		
		//약수의 개수 N 입력
		int N = sc.nextInt();
		
		while(N-->0) {
			//약수 입력
			int num = sc.nextInt();
			
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		
		System.out.println(max*min);
	}
}

	
