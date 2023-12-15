import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
        
        //N, K 입력 및 배열 선언(Collections 정렬을 위해 Integer로)
		int N = sc.nextInt();
		int K = sc.nextInt();
		Integer[] arr = new Integer[N];
		
        //배열 값 입력
        for(int i=0 ; i<N ;i++) {
			arr[i] = sc.nextInt();
		}
		
		int minus = (K-1)*K / 2;
		
        //내림차순 정렬
		Arrays.sort(arr, Collections.reverseOrder());        
		
		int answer = 0;
		for(int i=0 ; i<K ;i++) {
        // 정렬한 배열을 앞에서부터 K개 더해주기
			answer += arr[i];
		}
		
		System.out.println(answer - minus);
		
	}
}