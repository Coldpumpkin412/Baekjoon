import java.util.*;
import java.io.*;

public class Main {
	static int[] B;
	static boolean check;
	
	//퀵소트
	static void quick_sort(int[] arr, int start, int end) {
		//시작포인터가 끝포인터를 넘거나 check변수가 true일 때
		if(start>=end || check) {
			return;
		}
		
		//분할값
		int part2 = partition(arr, start, end);
		
		//왼쪽부분 정렬
		quick_sort(arr, start, part2-1);			
		
		//오른쪽부분 정렬
		quick_sort(arr, part2+1, end);
	}
	
	//파티션
	static int partition(int[] arr, int start, int end) {
		
		//피벗값(맨 끝값)
		int pivot = arr[end];
		
		//각각 시작점, 끝점 포인터
		int left = start;
		int right = end;
		
		//겹치지 않을때까지
		while(left < right) {
			//피벗값보다 큰 값을 찾을때까지 시작점 인덱스 이동
			while(left<right && arr[left]<pivot) {
				left++;
			}
			
			//피벗값보다 작은 값을 찾을때까지 끝점 인덱스 이동
			while(left<right && arr[right]>=pivot) {
				right--;
			}
			
			//교환
			swap(arr, left, right);
			
			//배열 비교
			compare(arr);
		}
		
		//교환 및 비교
		swap(arr, right, end);
		compare(arr);
		
		return right;
	}
	
	//교환함수
	static void swap(int[] arr, int num1, int num2) {
		int tmp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = tmp;		
	}
	
	//배열 비교함수
	static boolean compare(int[] arr) {
		//비교배열과 다르다면
		if(!Arrays.equals(arr, B)) {
			return false;
		}else { //같다면
			check = true;
			return true;
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//배열 A, B의 크기 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//배열 A, B 선언 및 값 입력
    	int[] A = new int[N];
    	B = new int[N];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		A[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		B[i] = Integer.parseInt(st.nextToken());
    	}
        
    	//정렬 전 두 배열 비교
    	compare(A);
    	
    	//A배열 퀵소트
    	quick_sort(A, 0, N-1);
    	
    	//체크변수가 true면 1을, 아니면 0을 반환
    	System.out.println(check ? 1 : 0);
    }
}	
