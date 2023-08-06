import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//N입력 및 배열 선언
    	int N = Integer.parseInt(br.readLine());
    	int[] arr = new int[N];
    	
    	//배열값 입력
    	for(int i=0 ; i<N ; i++) {
    		arr[i] = Integer.parseInt(br.readLine());
    	}
    	
    	int answer = 0;
    	
    	//맨뒤의 앞 배열부터 확인
    	for(int i=N-2 ; i>=0 ; i--) {
    		//뒤의 값이 더 커질때까지
    		while(arr[i]>=arr[i+1]) {
    			arr[i]--;
    			answer++;
    		}
    	}
    	
    	System.out.println(answer);
    }
}	
