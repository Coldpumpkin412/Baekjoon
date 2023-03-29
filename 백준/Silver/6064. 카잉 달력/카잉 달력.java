import java.util.*;
import java.io.*;	

public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * 정수 x,y가 k번째 해라고 했을 때
		 * k를 M,N으로 나누었을 때 나머지가 각각 x,y가 된다
		 * 
		 * ex) M=10,N=12 일 때, 13번째 해 : x=3,y=1
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//테스트케이스 개수 입력
		int T = Integer.parseInt(br.readLine());
		
		while(T-->0) {
			boolean check = false;
			
			st = new StringTokenizer(br.readLine());
			
			//기준이 되는 M,N 및 몇번 째 해인지 알아야하는 x,y입력
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			//나머지가 0이 되는 경우를 대비하여 1씩 빼주기
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			
			for(int i=x ; i<N*M ; i += M) {
				if(i%N == y) {
					System.out.println(i+1);
					check = true;
					break;
				}
			}
			
			//맞는 해가 없을 때 -1 출력
			if(!check) {
				System.out.println("-1");
			}
		}
	}
}

	
