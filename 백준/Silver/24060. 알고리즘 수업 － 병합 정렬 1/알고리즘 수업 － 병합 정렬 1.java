import java.util.*;
import java.io.*;

public class Main {
	static int[] tmp;
	static int count = 0;
	static int K;
	static int result = -1;
	
	static void merge_sort(int[]A, int p, int r) { //A[p..r]을 오름차순 정렬한다.
	    if (p < r)  {
	        int q = (p+r) / 2;       //q는 p, r의 중간 지점
	        merge_sort(A, p, q);       //전반부 정렬
	        merge_sort(A, q + 1, r);   //후반부 정렬
	        merge(A, p, q, r);         //병합
	    }
	}

	//A[p..q]와 A[q+1..r]을 병합하여 A[p..r]을 오름차순 정렬된 상태로 만든다.
	//A[p..q]와 A[q+1..r]은 이미 오름차순으로 정렬되어 있다.
	static void merge(int A[], int p, int q, int r) {
	    int i = p; 
	    int j = q + 1; 
	    int t = 0;
	    
	    while (i<=q && j<=r) {
	        if (A[i] <= A[j]) {
	        	tmp[t++] = A[i++]; 
	        } else {
	        	tmp[t++] = A[j++];
	        }
	    }
	    while (i<=q) {
	    	//왼쪽 배열 부분이 남은 경우
	    	tmp[t++] = A[i++];
	    }
	    while (j<=r) {
	    	//오른쪽 배열 부분이 남은 경우
	    	tmp[t++] = A[j++];
	    }
	    i = p; 
	    t = 0;
	    
	    while (i<=r) {
	    	count++;
	    	
	    	//횟수가 K에 도달한 경우
	    	if(count == K) {
	    		result = tmp[t]; break;
	    	}
	    	//# 결과를 A[p..r]에 저장
	    	A[i++] = tmp[t++]; 
	    }
	        
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//배열의 크기 및 K입력, 배열 선언
		st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		int[] A = new int[size];
		tmp = new int[size];
		
		//배열 값 입력
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<size ; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		merge_sort(A, 0, A.length-1);
		
		System.out.println(result);
	}
}

	
