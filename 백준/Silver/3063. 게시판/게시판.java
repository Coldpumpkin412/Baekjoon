import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
        //테스트케이스 개수 T 입력
		int T = Integer.parseInt(br.readLine());
        
		while(T-->0) {
            //꼭짓점 좌표 입력
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int x3 = Integer.parseInt(st.nextToken());
			int y3 = Integer.parseInt(st.nextToken());
			int x4 = Integer.parseInt(st.nextToken());
			int y4 = Integer.parseInt(st.nextToken());
            
            //첫번째 사각형 넓이
			int S1 = (x2-x1) * (y2-y1);
            
            //가로, 세로
			int H = (Math.min(x2, x4) - Math.max(x1, x3));
			int W = (Math.min(y2, y4) - Math.max(y1, y3));
                        
            //두번째 사각형
			int S2 = 0;
			if(H>0 && W>0) {
				S2 = H * W;
			}
            
			sb.append(S1 - S2 + "\n");
		}
		System.out.println(sb.toString());	
	}
}