import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
        //게임 차여하는 사람의 수 N, 보성이 번호 K 입력
        st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
        
        //i번 사람이 지목하는사람 번호 저장배열 선언 및 값입력
		int[] arr = new int[N];
		for (int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
        //현재 인덱스
		int now = 0;
        
        //정답변수
        int answer = 0;
		boolean check = false;
        
        //방문처리배열
		boolean[] visited = new boolean[N];
		
		while(true) {
			// 끝난 경우
			if(arr[now] == K) {
				answer++;
				break;
			}
			//반복 순환 방지
			if(visited[arr[now]]) {
				check = true;
				break;
			}else {
				now = arr[now];
                
                //방문처리
				visited[now] = true;
				answer++;
			}
		}
		if(check) {
			System.out.println(-1);
		}else {
			System.out.println(answer);
		}
	}
}