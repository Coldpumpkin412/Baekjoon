import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //팬 수 N 입력
		int N = Integer.parseInt(br.readLine());
		
		int start = -1; 
		int finish = 100001;
		
		for(int i=0 ; i<N ; i++) {
            //머문시간 입력
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
            //갱신
            start = Math.max(start, s);
            finish = Math.min(finish, e);
		}
		
		int answer = start - finish;
        
        System.out.println((answer<0) ? "0" : answer);
	}
}
	