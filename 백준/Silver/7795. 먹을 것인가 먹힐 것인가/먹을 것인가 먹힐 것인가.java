import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//테스트케이스 개수 T 입력
    	int T = Integer.parseInt(br.readLine());
    	
    	while(T-->0) {
    		//A>B인 쌍의 개수 변수
    		int count = 0;
    		
    		//A의 수 N, B의 수 M 입력 및 배열 선언
    		st = new StringTokenizer(br.readLine());
    		int N = Integer.parseInt(st.nextToken());
    		int M = Integer.parseInt(st.nextToken());
    		
    		//내림차순을 위햇 A는 Integer로 선언
    		Integer[] A = new Integer[N];
    		int[] B = new int[M];
    		
    		//A,B 배열의 값 입력
    		st = new StringTokenizer(br.readLine());
    		for(int i=0 ; i<N ; i++) {
    			A[i] = Integer.parseInt(st.nextToken());
    		}
    		
    		st = new StringTokenizer(br.readLine());
    		for(int i=0 ; i<M ; i++) {
    			B[i] = Integer.parseInt(st.nextToken());
    		}
    		
    		//A배열은 내림차순, B배열은 오름차순으로 정렬
    		Arrays.sort(A, Collections.reverseOrder());
    		Arrays.sort(B);
    		
    		//A배열의 해당차례숫자가 B배열의 첫 원소보다 작거나 같은경우 나오기
    		for(int i=0 ; i<N ; i++) {
    			if(A[i] <= B[0]) {
    				break;
    			}
    			
    			for(int j=0 ; j<M ; j++) {
    				if(A[i] > B[j]) {
    					count++;
    				}else {
    					break;
    				}
    			}
    		}
    		
    		sb.append(count).append("\n");
    	}
    	
    	System.out.println(sb);
    }
}	
