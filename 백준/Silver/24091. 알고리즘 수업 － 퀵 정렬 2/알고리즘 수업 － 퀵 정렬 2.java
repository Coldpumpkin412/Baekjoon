
import java.util.*;import java.io.*;


public class Main {
	//교환횟수
	static int count = 0;
	static int K;
	
	static StringBuilder sb = new StringBuilder();
	
	//퀵소트
	static void quick_sort(int[] arr, int start, int end) {
		if(start < end) {
			//분할값
			int q = partition(arr, start, end);
			
			//왼쪽부분 정렬 재귀호출
			quick_sort(arr, start, q-1);
			//오른쪽부분 정렬 재귀호출
			quick_sort(arr, q+1, end);
		}
	}
	
	//파티션함수
	static int partition(int[] arr, int start, int end) {
		//피벗값 (편의상 맨 끝으로 설정)
		int pivot = arr[end];
		
		int i = start - 1;
		
		for(int j=start ; j<end ; j++) {
			//피벗값보다 작은경우
			if(arr[j] <= pivot) {
				swap(arr, ++i, j);
			}
		}
		
		if(i+1 != end) {
			swap(arr, i+1, end);
		}
		
		return i+1;
	}
	
	//스왑함수
	static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
		
		//카운트 증가
		count++;
		
		//교환횟수가 K와 같다면
		if(count == K) {
			//배열 현재상태 저장
			for(int num : arr) {
				sb.append(num+" ");
			}
			return;
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//배열 A의 크기 N, 교환 횟수 K 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	K = Integer.parseInt(st.nextToken());
    	
    	//배열 A선언 및 값 입력
    	int[] A = new int[N];
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		A[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//퀵소트
    	quick_sort(A, 0, A.length-1);
    	
    	//교환횟수가 K보다 작다면 -1을, 아니면 값을 출력
    	System.out.println((count<K) ? -1 : sb.toString());
    }
}	
