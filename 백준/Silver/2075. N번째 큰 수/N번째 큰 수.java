import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//N입력 
    	int N = Integer.parseInt(br.readLine());
    	
    	//NxN배열을 1xN^2배열로 변환하여 쭉 입력
    	int[] num = new int[N*N];
    	
    	int index = 0;
    	for(int i=0 ; i<N ; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0 ; j<N ; j++) {
    			num[index] = Integer.parseInt(st.nextToken());
    			
    			index++;
    		}
    	}
    	
    	//배열 오름차순 정렬
    	Arrays.sort(num);
    	
    	System.out.println(num[N*N - N]);
    }
}	
