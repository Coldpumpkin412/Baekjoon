import java.util.*;
import java.io.*;

public class Main {
	
	public static long answer = 0;
    
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	
    	StringTokenizer st;
        
    	int N = Integer.parseInt(br.readLine());
    	int[] arr = new int[N];
    	int[] prefixSum = new int[N+1];
    	int sumValue = 0;
        
        st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	
        	sumValue += arr[i];
        	prefixSum[i+1] = sumValue;
    	}
        
    	for(int i=0 ; i<N ; i++) {
    		int standard = arr[i];
    		int calculatedSum = prefixSum[N] - prefixSum[i+1];

    		answer += standard * calculatedSum;
    	}
    	
    	System.out.println(answer);
    }
}
