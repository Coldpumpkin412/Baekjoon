import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st;
        
        //문제 개수 N 입력
		int N = Integer.parseInt(br.readLine());
		
        //가장 높은 난이도로 초기값 설정
		int min = 5;
        
		String answer = "";
        
		while(N-->0) {
            //문제 제목, 난이도 입력
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
            //최솟값 초기화 및 정답 변경
			if(num < min) {
				min = num;
				answer = str;
			}
		}
        
		System.out.print(answer);
	}
}