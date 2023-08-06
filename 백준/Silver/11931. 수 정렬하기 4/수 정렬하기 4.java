import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	//N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//정렬을 위해 Integer로 선언
    	Integer[] arr = new Integer[N];
    	
    	for(int i=0 ; i<N ; i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    	}
    	
    	Arrays.sort(arr, Collections.reverseOrder());
    	
    	for(int num : arr) {
    		sb.append(num+"\n");
    	}
    	
    	System.out.print(sb);
    }
}	
