import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1;
        StringTokenizer st2;
		
        //N 입력
		int N = Integer.parseInt(br.readLine());		
		int[] coin1 = new int[N];
		int[] coin2 = new int[N];
        
		int answer = 0;
		
        st1 = new StringTokenizer(br.readLine());
        st2 = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			coin1[i] = Math.abs(Integer.parseInt(st1.nextToken()));
			coin2[i] = Math.abs(Integer.parseInt(st2.nextToken()));
			
			answer += coin1[i] + coin2[i];
		}
        
		System.out.println(answer);
	}
}