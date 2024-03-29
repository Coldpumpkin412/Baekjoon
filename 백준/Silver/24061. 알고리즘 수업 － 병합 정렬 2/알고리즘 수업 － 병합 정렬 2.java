import java.util.*;
import java.io.*;

public class Main {
	static int K;
	static int[] tmp;
	
	//변경횟수
	static int count = 0;
	
	//체크 변수
	static boolean check;
	
	static StringBuilder sb = new StringBuilder();
	
	//병합정렬 함수
	static void merge_sort(int[] arr, int start, int end) {
		//시작점이 끝점보다 작은경우
		if(start < end) {
			//중간지점
			int mid = (start+end) / 2;
			
			//재귀호출
			merge_sort(arr, start, mid);
			merge_sort(arr, mid+1, end);
			
			//병합함수
			merge(arr, start, mid, end);
		}
	}
	
	//병합함수
	static void merge(int[] arr, int start, int mid, int end) {
		int i = start;
		int j = mid + 1;
		int t = 0;
		
		while(i<=mid && j<=end) {
			if(arr[i] <= arr[j]) {
				tmp[t++] = arr[i++];
			}else {
				tmp[t++] = arr[j++];
			}
		}
		
		while(i <= mid) {
			tmp[t++] = arr[i++];
		}
		
		while(j <= end) {
			tmp[t++] = arr[j++];
		}
		
		i = start;
		t = 0;
		
		while(i <= end) {
			count++;
			arr[i++] = tmp[t++];
			
			//횟수가 같아지면
			if(count == K) {
				check = true;
				
				for(int number : arr) {
					sb.append(number+" ");
				}
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;   
    	
    	//배열 A의 크기, 변경 횟수 K 입력
    	st = new StringTokenizer(br.readLine());
    	int A = Integer.parseInt(st.nextToken());
    	K = Integer.parseInt(st.nextToken());
    	
    	//배열 선언 및 값 입력
    	int[] num = new int[A];
    	tmp = new int[A];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<A ; i++) {
    		num[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//병합정렬 함수 실행
    	merge_sort(num, 0, A-1);
    	
    	//체크변수가 참이면 결과값 출력, 아니면 -1 출력
    	System.out.print(check ? sb.toString() : -1);
    }
}	
