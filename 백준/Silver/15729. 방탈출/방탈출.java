import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //N 입력
		int N = Integer.parseInt(br.readLine());
		
        //버튼 배열
		int[] button = new int[N+2];
		
        //버튼 상태 입력
		st = new StringTokenizer(br.readLine());
		for(int i=0 ; i<N ; i++) {
            button[i] = Integer.parseInt(st.nextToken());
        }
			
		int count = 0;
        
		for(int i=0 ; i<N ; i++) {
            //버튼이 켜져있으면
			if(button[i] == 1) {
                //횟수 증가
				count++;
                
                //옆에 것과 옆옆에 것들 켜져있으면 끄고, 꺼져있으면 키기
				button[i+1] = button[i+1]==1 ? 0 : 1;
				button[i+2] = button[i+2]==1 ? 0 : 1;
			}
		}	
		
		System.out.println(count);
	}

}