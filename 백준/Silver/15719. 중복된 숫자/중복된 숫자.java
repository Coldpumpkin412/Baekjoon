import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //수열 크기 N 입력
		int N = Integer.parseInt(br.readLine());
        
        //수열 A 선언
		boolean[] A = new boolean[N];
        
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			int num = Integer.parseInt(st.nextToken());
            
            //이미 존재한다면
			if(A[num]) {
                //출력
				System.out.println(num);
				break;
			}
            
            //처음 등장한 수라면 방문처리
			A[num] = true;
		}
        
	}
}