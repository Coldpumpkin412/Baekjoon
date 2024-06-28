import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st;
		
        //N, L, H 입력
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
		
		int[] score = new int[N];
        
        //영화 평가 점수 입력
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
        //오름차순 정렬
		Arrays.sort(score);
		
		double answer = 0;
		for(int i=L ; i<N-H ; i++) {
			answer += score[i];
		}
        
		System.out.print(answer / (N-L-H));
	}
}