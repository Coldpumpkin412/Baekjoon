import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
        //투포인터 활용하여 풀기
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력
		int N = Integer.parseInt(br.readLine());
        
	    //투포인터 설정
		int start = 0;
        int end = 0; 
        
        //누적합 저장변수 및 정답변수 선언
		int sum = 0;
        int answer = 0; 
        
		while(start<=N) {
			while(++end<=N) {
                //누적합 증가
				sum += end;
                
				if(sum>=N) {
					if(sum==N) answer++;
					break;
				}
			}
            
			while(++start<=N) {
				//누적합 감소
                sum -= start;
                
				if(sum<=N) {
					if(sum==N) answer++;
					break;
				}
			}	
		}
		System.out.println(answer);
	}
}