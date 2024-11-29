import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		
        //팀원 수 N, 나눠줄 상금 D 입력
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
        
        //해결한 문제수 배열 선언
		int[] solve = new int[N];
		int total = 0;
		
		for(int i=0 ; i<N ; i++) {
			solve[i] = Integer.parseInt(br.readLine());
			total += solve[i];
		}
		
		total = D / total;
        
		for(int i=0 ; i<N ; i++) {
			System.out.println(total * solve[i]);
		}
        
	}
}