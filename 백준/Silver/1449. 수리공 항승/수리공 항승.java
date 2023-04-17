import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//물이새는곳의 개수N, 테이프 길이L 입력
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		//물이 새는곳을 저장할 배열 선언 밉 값 입력
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//입력된 새는 곳을 오름차순으로 정렬
		Arrays.sort(arr);
		
		//테이프를 처음 붙이는 위치 및 테이프의 개수 초기화
		double point = arr[0] - 0.5;
		int answer=1;
		
		for(int i=0 ; i<N ; i++) {
			
			//테이프 붙인곳에서 길이만큼의 지점이 누수지점보다 짧은경우 
			//필요한 테이프의 개수 늘려주고 위치 갱신
			if(point+L < arr[i]) {
				answer++;
				point = arr[i] - 0.5;
			}
		}
		
		System.out.println(answer);
	}
}

	
