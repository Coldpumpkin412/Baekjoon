import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
        //투포인터 활용하여 풀기(양끝에서 시작하여 중간에서 만나기)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
        //수열의 크기 N입력 및 배열 선언
		int N = Integer.parseInt(br.readLine());        		
		int[] arr = new int[N];
        
        //배열값 입력
        st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
        //배열 오름차순 정렬
		Arrays.sort(arr);
		
		int x = Integer.parseInt(br.readLine());
        
		int answer = 0;
        
        //시작점 및 끝점 변수
		int start = 0;
		int end = N-1;
        
        //누적합
		int sum = 0;
		
		while(start < end) {
			sum = arr[start] + arr[end];
            
			if(sum == x) {
				answer++;
			}
			
			if(sum <= x) {
				start++;
			}else {
				end--;
			}
		}
		
		
		System.out.println(answer);
	}
}