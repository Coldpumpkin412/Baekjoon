import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	//최소신장트리 활용(간선개수 = 정점개수-1 이므로 비행기 최소개수는 국가 수 -1 이다)
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		while (T-->0) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			for (int i=0 ; i<M ; i++) {
				br.readLine();
			}
			
			sb.append((N-1) + "\n");
		}
		
		System.out.println(sb.toString());
    }
}	
