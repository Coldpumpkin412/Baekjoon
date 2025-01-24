import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //테스트케이스 개수 T 입력
		int T = Integer.parseInt(br.readLine());
        
		while(T-->0) {
            //플레이어 숫자 입력
			int N = Integer.parseInt(br.readLine());
            
            //지명한 사람 숫자 배열 선언
			int[] A = new int[N+1];
            
			boolean[] check = new boolean[N+1];
            
            //지명한 사람 숫자 입력
			for(int i=1 ; i<=N ; i++) {
				A[i] = Integer.parseInt(br.readLine());
			}
			
			int next = 1;
            int K = 0;
            int state = 0;
            
			//다음사람지목,불러야하는 정수, 무한루프 탐색 
			while(true) {
				if(A[next] == N) {
					K++;
					break;
				}
				if(check[A[next]] == true) {  //만약 왔던 곳인 경우 
					state = 1;
					break;
				}else { //처음온 곳인 경우
                    //다음사람
					next = A[next]; 
                    
                    //방문처리
					check[next] = true; 
					K++;
				}
				
			}
			if(state == 1) {
                System.out.println(0);
            }else {
                System.out.println(K);
            }
		}
	}
}