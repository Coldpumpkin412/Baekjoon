import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 T 입력
		int T = Integer.parseInt(br.readLine());
        
		while(T-->0) {
            //지원자 수 N 입력
			int N = Integer.parseInt(br.readLine());
			
            //지원자 배열
			int[] arr = new int[N];
            
			for(int i=0 ; i<N ; i++) {
                //성적 입력
				st = new StringTokenizer(br.readLine());
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
                
				arr[A-1] = B;
			}
			int count =1;
            
			int index = arr[0];
            
			for(int i=1 ; i<N ; i++) {
				if(index > arr[i]) {
					count++;
					index = arr[i];
				}
			}
			sb.append(count).append("\n");
		}
        
		System.out.println(sb.toString());
	}
}