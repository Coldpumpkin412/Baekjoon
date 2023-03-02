import java.util.*;
import java.io.*;

public class Main {
	//이진탐색 함수
	public static int binarySearch(int[] cards, int N, int search) {
		int left=0;
		int right = N-1;
		int mid = 0;
        
		while(left <= right) {
			mid = (left+right)/2;
			if(cards[mid] == search) return 1;
			if(cards[mid]>search) right=mid - 1;
			else left = mid+1;
		}
        
		return 0; 
	}
	
	public static void main(String[] args) throws IOException{
		/*
         * M개의 확인에 대해 N개의 카드를 전부 확인하는 선형탐색은 시간복잡도O(MN) : 시간초과
         * 시간복잡도가 O(logN)인 이진탐색을 사용하여 걸리는 시간을O(MlogN)만큼 줄여야한다.
		 */
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine()); //상근이가 가지고있는 숫자 카드의 개수
		
		//상근이의 카드 입력
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr); //이진탐색을 위해 오름차순 정렬
		
		//비교할 카드의 개수 입력
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<M ; i++) {
			int temp = Integer.parseInt(st.nextToken());
			System.out.print(binarySearch(arr, N, temp) + " ");
		}

	}
}

	
