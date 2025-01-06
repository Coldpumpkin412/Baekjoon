import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//N, K 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(st.nextToken());
    	
    	//다이아몬드 크기 배열 선언 및 값 입력
    	int[] diamond = new int[N];
    	for(int i=0 ; i<N ; i++) {
    		diamond[i] = Integer.parseInt(br.readLine());
    	}
    	
    	//오름차순 배열
    	Arrays.sort(diamond);
    	
    	int max = 0;
    	
    	for(int i=0 ; i<N-1 ; i++) {
    		int count = 1;
    		
    		for(int j=i+1 ; j<N ; j++) {
    			if(diamond[j]-diamond[i] <= K) {
    				count++;
    			}
    		}
    		
    		max = Math.max(max, count);
    	}
    	
    	System.out.println(max);
    }
}
