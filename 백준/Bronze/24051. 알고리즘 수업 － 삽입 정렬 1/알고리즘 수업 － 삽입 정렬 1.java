import java.util.*;
import java.io.*;

public class Main {
	static int K;
	static int count = 0;
    
	static StringBuilder sb = new StringBuilder();
	
	//삽입정렬
	static void insertion_sort(int[] num) {
		for(int i=1 ; i<num.length ; i++) {
			//타겟 값
			int target = num[i];
			int loc = i-1;
			
			while(0<=loc && target<num[loc]) {
				int tmp = num[loc];
				num[loc+1] = tmp;
				loc--;
				
				count += 1;
				
				if(count == K) {
					sb.append(tmp);
					return;
				}
			}
			
			if(loc+1 != i) {
				num[loc+1] = target;
				count += 1;
				
				if(count == K) {
					sb.append(target);
					return;
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
    	
    	//배열값 입력
    	int[] A = new int[N];
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		A[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//삽입정렬
    	insertion_sort(A);
    	
    	System.out.println((count==K) ? sb.toString() : -1);
    }
}	
