import java.util.*;
import java.io.*;

public class Main {
	static int K;
	static int count = 0;
	static StringBuilder sb = new StringBuilder();
	
	//버블정렬
	static void bubble_sort(int[] num) {
		for(int last=num.length-1 ; last>=1 ; last--) {
			for(int i=0 ; i<=last-1 ; i++) {
				if(num[i] > num[i+1]) {
					count++;
					//원소 교환
					int tmp = num[i];
					num[i] = num[i+1];
					num[i+1] = tmp;
					
					//교환횟수가 같아지면
					if(count == K) {
						sb.append(num[i]+" "+num[i+1]);
						return;
					}
				}
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//배열 크기 N, 교환 횟수 K입력    	
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	K = Integer.parseInt(st.nextToken());
    	
    	//배열 A 선언 및 값 입력
    	int[] A = new int[N];
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		A[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//버블정렬
    	bubble_sort(A);
    	
    	System.out.println((count==K) ? sb.toString() : -1);
    }
}	
