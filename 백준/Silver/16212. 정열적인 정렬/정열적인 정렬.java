import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	StringBuilder sb = new StringBuilder();
    	
    	//배열 길이 N 입력 및 선언
    	int N = Integer.parseInt(br.readLine());
    	int[] arr = new int[N];
    	
    	//배열 값 입력
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//오름차순 정렬
    	Arrays.sort(arr);
    	
    	//배열 값 스트링빌더에 저장 후 출력
    	for(int num : arr) {
    		sb.append(num+" ");
    	}
    	
    	System.out.println(sb);
    }
}	
