import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        //시작이 빨,초,파인 경우를 모두 계산 후 최소값 찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int N = Integer.parseInt(br.readLine());

		int[][] house = new int[N+1][3];

		for (int i=1 ; i<=N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0 ; j<3 ; j++) {
				house[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int[][] D = new int[N+1][3];

		for (int i = 1; i <= N; i++) {
			D[i][0] = Math.min(D[i-1][1], D[i-1][2]) + house[i][0];
			D[i][1] = Math.min(D[i-1][0], D[i-1][2]) + house[i][1];
			D[i][2] = Math.min(D[i-1][0], D[i-1][1]) + house[i][2];
		}
		System.out.println(Math.min(Math.min(D[N][0], D[N][1]), D[N][2]));

	}
}