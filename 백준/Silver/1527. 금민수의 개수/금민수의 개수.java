import java.util.*;
import java.io.*;

public class Main {
	static int A;
    static int B;
    
    //정답변수 초기화
	static int answer = 0;

	public static void DFS(long num) {
		//숫자 범위 체크 및 종료 조건
		if(num > B) {
            return;    
        } 
        
        //A와 B 사이에 있다면 정답 개수 증가
		if(num>=A && num<=B) {
            answer++;
        }
        
		//4, 7만 들어 갈 수 있는 재귀호출
		DFS(num*10 + 4);
		DFS(num*10 + 7);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //숫자 A, B 입력
        st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
        
		//DFS 실행
		DFS(0);
        
		System.out.println(answer);
	}
}