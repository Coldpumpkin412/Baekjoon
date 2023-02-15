import java.util.*;
import java.io.*;

public class Main {
	/*람다식 활용
	 * 람다함수란, 프로그래밍 언어에서 익명 함수를 지칭하는 용어. 수학에서 사용하는 함수를 보다 단순히 표현
	 * 사용방법 : (매개변수1, ...) -> {함수;} 
	 * ex) sum함수를 람다식으로 표현하면
	 *     (int a, int b) -> {return a + b;}
	 */
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//좌표의 개수 입력
		int N = Integer.parseInt(br.readLine()); 
		int[][] answer = new int[N][2]; //정답 저장 배열
		
		for(int i=0 ; i<N ; i++) {
			//BufferedReader는 라인단위로 읽어들일 수 밖에 없으므로
			//StringTokenizer을 이용하여 공백 단위로 확인
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			answer[i][0] = Integer.parseInt(st.nextToken());
			answer[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//람다식을 활용하여 answer배열 정렬
		//compareTo는 양수,음수를 통해 정렬을 판단
		Arrays.sort(answer, (e1, e2) ->{
			if(e1[1] == e2[1]) return e1[0] - e2[0];
			else return e1[1] - e2[1];
		});
		
		for(int i=0 ; i<answer.length ; i++) {
			System.out.println(answer[i][0] + " " + answer[i][1]);
		}
	}
}