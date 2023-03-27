import java.util.*;
import java.io.*;	


public class Main {
	public static void main(String[] args) throws IOException{
		// NxM 행렬과 MxK 행렬의 곱은 NxK꼴의 행렬로 나오게 된다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//행렬 A의크기 N과 M입력 및 행렬 선언
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N][M];
		
		//행렬 A의 값 입력
		for(int i=0 ; i<N ; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0 ; j<M ; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//행렬 B의 크기 M과 K입력 및 행렬 선언
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[][] B = new int[M][K];
		
		//행렬 B의 값 입력
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0 ; j<K ; j++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//정답행렬 선언
		int[][] answer = new int[N][K];
		
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<K ; j++) {
				for(int k=0 ; k<M ; k++) {
					answer[i][j] += A[i][k]*B[k][j];
				}
				System.out.print(answer[i][j]+" ");
			}
			System.out.println();
		}
	}
}

	
