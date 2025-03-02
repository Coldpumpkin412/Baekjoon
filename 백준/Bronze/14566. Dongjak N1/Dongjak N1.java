import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;		
		StringBuilder sb = new StringBuilder();
        
        //정류장 개수 입력
		int N = Integer.parseInt(br.readLine());		
	
        //정류장 좌표 배열 선언 및 값 입력
		int[] stop = new int[N];
        
        st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
			stop[i] = Integer.parseInt(st.nextToken());
		}
		
        //최솟값 변수
		int min = Integer.MAX_VALUE;
		int count = 0;
        
        //오름차순 정렬
		Arrays.sort(stop);
		
		for(int i=0 ; i<N-1 ; i++) {
			min = Math.min(min, stop[i+1] - stop[i]);
		}
		
		for(int i=0 ; i<N-1 ; i++) {
			if (stop[i+1] - stop[i] == min) {
				count++;
			}
		}
        
        System.out.println(min + " " + count);
	}
}