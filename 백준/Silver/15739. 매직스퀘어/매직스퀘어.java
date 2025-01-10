import java.util.*;
import java.io.*;

public class Main {	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//배열 선언
    	int[][] arr = new int[N][N];
    	
    	//중복수 체크
    	boolean[] check = new boolean[N*N+1];
    	
    	//배열 값 입력
    	for(int i=0 ; i<N ; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		for(int j=0 ; j<N ; j++) {
    			arr[i][j] = Integer.parseInt(st.nextToken());
    			
    			check[arr[i][j]] = true;
    		}
    	}
    	
    	//중복되는 수 있는지 확인
    	for(int i=1 ; i<=N*N ; i++) {
    		if(!check[i]) {
    			System.out.println("FALSE");
    			return;
    		}
    	}
    	
    	//비교군
    	int sum = N*(N*N+1) / 2;
    	
    	//행 먼저 비교
    	for(int i=0 ; i<N ; i++) {
    		int cmp = 0;
    		
    		for(int j=0 ; j<N ; j++) {
    			cmp += arr[i][j];
    		}
    		
    		if(sum != cmp) {
    			System.out.println("FALSE");
    			return;
    		}
    	}
    	
    	//열 비교
    	for(int i=0 ; i<N ; i++) {
    		int cmp = 0;
    		
    		for(int j=0 ; j<N ; j++) {
    			cmp += arr[j][i];
    		}
    		
    		if(sum != cmp) {
    			System.out.println("FALSE");
    			return;
    		}
    	}
    	
    	// '\'모양 대각선 확인
    	int cmp = 0;
    	
    	for(int i=0 ; i<N ; i++) {
    		cmp += arr[i][i];
    	}
    	
    	if(sum != cmp) {
			System.out.println("FALSE");
			return;
		}
    	
    	// '/'모양 대각선 확인
    	cmp = 0;
    	
    	for(int i=0 ; i<N ; i++) {
    		cmp += arr[i][N-1-i];
    	}
    	
    	if(sum != cmp) {
			System.out.println("FALSE");
			return;
		}
    	
    	System.out.println("TRUE");
    }
}
