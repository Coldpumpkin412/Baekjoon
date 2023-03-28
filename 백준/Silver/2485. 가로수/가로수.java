import java.util.*;
import java.io.*;	


public class Main {
	public static int GCD(int a, int b) {
		while(b>0) {
			int r = a;
			
			a = b;
			b = r%b;
		}
		
		return a;
	}
	public static void main(String[] args) throws IOException{
		/*
		 * 최종간격 : 주어진 가로수의 간격 간 최대공약수
		 * 유클리드호제법 사용
		 */
		Scanner sc = new Scanner(System.in);
		
		//심어져있는 가로수의 수 N 입력
		int N = sc.nextInt();
		
		//심어져있는 가로수의 위치 배열 및 간격배열
		int[] arr = new int[N];
		int[] gap = new int[N-1];
		
		for(int i=0 ; i<N ; i++) {
			arr[i] = sc.nextInt();
			
			if(i>0) gap[i-1] = arr[i]-arr[i-1];
		}
		
		for(int i=0 ; i<=gap.length-2 ; i++) {
			//나무간격들의 최대공약수 구하기
			gap[i+1] = GCD(gap[i],gap[i+1]);
		}
		
		int number = gap[gap.length - 1];
		
		System.out.println( (arr[N-1]-arr[0]) / number-(N-1));
	}
}

	
