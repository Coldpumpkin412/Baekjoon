import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //H, W, X, Y 입력
        st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
        
        //배열A 선언
		int[][] A = new int[H][W];
        
        //배열B의 크기 선언 및 배열 선언
		int BX = H+X;
        int BY = W+Y;
		int[][] B = new int[BX][BY];
        
        //배열B 값 입력
		for(int i=0 ; i<BX ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<BY ; j++) {
				B[i][j]= Integer.parseInt(st.nextToken());
			}
		}
        
        
		for(int i=0 ; i<BX ; i++) {
			for(int j=0 ; j<BY ; j++) {
				
                //안겹치는 부분(위쪽)
                if(i<X && j<W) {
					A[i][j] = B[i][j];
				}else if(j<Y && i<H) { //안겹치는 부분(왼쪽)
					A[i][j] = B[i][j];
				}else if(j>=Y && i>=X && j<W && i<H) {//겹치는 부분
					A[i][j] = B[i][j] - A[i-X][j-Y];
				}
			}
		}
		
        //결과출력
		for(int i=0 ; i<H ; i++) {
			for(int j=0 ; j<W ; j++) {
				System.out.print(A[i][j]+ " ");
			}
			System.out.println();
		}
	}
}