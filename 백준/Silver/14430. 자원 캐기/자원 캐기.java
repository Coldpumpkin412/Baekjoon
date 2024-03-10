import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //N, M 입력 및 자원 배열 선언
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] array = new int[N][M];
		
        //자원 값 입력
		for(int i=0 ; i<N ; i++) {
			for(int j=0 ; j<M ; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
        //i행 0열
		for(int i=1 ; i<N ; i++) {
			array[i][0] += array[i-1][0]; 
		}
		
        //0행 i열
		for(int i=1 ; i<M ; i++) {
			array[0][i] += array[0][i-1];
		}
		
        //최댓값 갱신하며 더해가기
		for(int i=1 ; i<N ; i++) {
			for(int j=1 ; j<M ; j++) {
				array[i][j] += Math.max(array[i-1][j], array[i][j-1]); 
			}
		}
        
        //최댓값 출력
		System.out.println(array[N-1][M-1]);
	}

}