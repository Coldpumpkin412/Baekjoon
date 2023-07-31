import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	//해시맵 활용하여 풀기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//N, K 입력
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(st.nextToken());
    	
    	//숫자 저장 배열 선언 및 값입력
    	int[] num = new int[N];
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		num[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	Arrays.sort(num);
    	
    	System.out.println(num[K-1]);
    }
}	
