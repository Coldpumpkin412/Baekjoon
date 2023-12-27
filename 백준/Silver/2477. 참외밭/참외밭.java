import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
        //단위면적당 자라는 참외개수 K 입력
		int K = Integer.parseInt(br.readLine());
        
        //최댓값 및 면적합 변수 선언 및 초기화
		int max = 0;
		int sum = 0;
        
        //첫 변의 방향 및 길이 입력(방향은 무시)
		st = new StringTokenizer(br.readLine());
		st.nextToken();
		int first = Integer.parseInt(st.nextToken());
        
        //초기길이 값 저장
		int edge = first;
		for(int i=1 ; i<6 ; i++) {
            //변의 방향 및 길이 입력(방향 무시)
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			int now = Integer.parseInt(st.nextToken());
            
            //두 변의 곱 중 최댓값 저장
			max = Math.max(now*edge, max);
            
            //넓이 더해준거 최신화
			sum += now*edge;
            
            //길이값 최신화
			edge = now;
		}
        
		max = Math.max(first*edge, max);
		sum += first*edge;
        
        //결과값 (사각형에서 작은 사각형 뺀 'ㄱ'자 모양)
		System.out.println((max-((max*3)-sum)) * K);
	}
}