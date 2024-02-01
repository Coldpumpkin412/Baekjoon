import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//떡국 그릇 크기 N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//떡국 그릇 배열 선언 및 값 입력
    	int[] soup = new int[N];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		soup[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	//떡국 배열 오름차순 정렬
    	Arrays.sort(soup);
    	
    	int answer = 1;
    	
    	//중복이 되는 숫자의 개수 최댓값 변수
    	int max = 1;
    	
    	//정렬된 수열에 대해 뒤에 배열값과 같다면 max 증가
    	for(int i=0 ; i<N-1 ; i++) {
    		if(soup[i] == soup[i+1]) {
    			max++;
    			
    			//최댓값 최신화
    			answer = Math.max(answer, max);
    		}else {
    			//다른 숫자인 경우 max 초기화
    			max = 1;
    		}
    	}
    	
    	System.out.println(answer);
    }
}	
