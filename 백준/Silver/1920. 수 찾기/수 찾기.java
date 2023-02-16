import java.io.*;
import java.util.*;

public class Main {
	/*
	 * 이분탐색 활용
	 * 반드시 오름차순 정렬, 중간값을 정한 후 비교할 값이 중간값보다 작다면 0~중간값을 탐색
	 * 비교할 값이 중간값보다 크다면 중간값~인덱스 끝까지 탐색
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //기준이 되는 수의 개수
		int[] arr1 = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0 ; i<N ; i++) arr1[i] = Integer.parseInt(st.nextToken());
		
		//이분탐색을 위해 오름차순 정렬
		Arrays.sort(arr1);
		
		int M = Integer.parseInt(br.readLine()); //비교할 수의 개수
		int[] arr2 = new int[M];
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0 ; i<M ; i++) arr2[i] = Integer.parseInt(st.nextToken());
		
		for(int i=0 ; i<M ; i++) System.out.println(BinarySearch(arr1, arr2[i]));
		
	}
	
	//이진탐색 함수
	public static int BinarySearch(int[] arr, int number) {
		int min = 0; //배열 인덱스의 최소값
		int max = arr.length-1; //배열 인덱스의 최댓값
		
		while(min <= max) {
			int mid = (min+max) / 2; //중간값
			
			if(arr[mid] > number) max = mid-1;
			else if(arr[mid] < number) min = mid+1;
			else if(arr[mid]==number) return 1; //수가 존재하면 1반환
		}
		//수가 존재하지않으면 0 반환
		return 0;
	}
}