import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        //배열의 크기 입력 및 배열 선언
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        
        //배열 초기화
        for (int i=0 ; i<N ; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0 ; j<M ; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        //테스트케이스 개수 K 입력
        int K = Integer.parseInt(br.readLine());
        while(K-->0) {
            st = new StringTokenizer(br.readLine());
            
            //시작점 입력
            int start_row = Integer.parseInt(st.nextToken())-1;
            int start_col = Integer.parseInt(st.nextToken())-1;
            
            //끝점 입력
            int final_row = Integer.parseInt(st.nextToken())-1;
            int final_col = Integer.parseInt(st.nextToken())-1;
            int sum = 0;
            
            //시작점부터 끝점까지 값들의 합
            for (int i=start_row ; i<=final_row ; i++) {
                for (int j=start_col ; j<=final_col; j++) {
                    sum += arr[i][j];
                }
            }
            sb.append(sum + "\n");
        }
        
        //결과출력
        System.out.print(sb);
	}
}

	
