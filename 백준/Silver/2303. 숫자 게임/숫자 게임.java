import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
        //N입력 및 배열 선언
    	int N = Integer.parseInt(br.readLine());
    	int[] arr = new int[5];
    	int[] list = new int[N];
    	
    	for(int i=0 ; i<N ; i++) {
            //배열 값 입력
    		st = new StringTokenizer(br.readLine());
    		for(int j=0 ; j<5 ; j++) {
    			arr[j] = Integer.parseInt(st.nextToken());
    		}
    		
            //최댓값 초기값입력
    		int max = Integer.MIN_VALUE;
    		
            //최댓값 갱신
    		for(int j=0 ; j<3 ; j++) {
    			for(int k=j+1 ; k<4 ; k++) {
    				for(int index = k+1 ; index<5 ; index++) {
    					max = Math.max(max, (arr[j]+arr[k]+arr[index])%10);
    				}
    			}
    		}
    		
    		list[i] = max;
    	}
    	
        //정답 및 비교변수
    	int answer = -1;
    	int res = -1;
    	
    	for(int i=0 ; i<N ; i++) {
    		if(res <= list[i]) {
    			res = list[i];
    			answer = i+1;
    		}
    	}
    	
    	System.out.println(answer);
    }
}	
