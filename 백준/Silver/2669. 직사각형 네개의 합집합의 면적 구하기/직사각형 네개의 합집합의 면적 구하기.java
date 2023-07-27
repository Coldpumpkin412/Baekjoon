import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
		boolean[][] check = new boolean[101][101];

		for (int i=0 ; i<4 ; i++) {
            //좌표 두 개 입력
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			for (int j=y1 ; j<y2 ; j++) {
				for (int k=x1; k<x2 ; k++) {
                    //겹치는 부분을 true로 변경
					check[j][k] = true;
				}
			}
		}
        
        //true의 개수가 정답
		int answer = 0;
		for (int i=0 ; i<101 ; i++) {
			for (int j=0 ; j<101 ; j++) {
				if (check[i][j]==true) {
					answer++;
				}
			}
		}
        
		System.out.println(answer);

	}
}