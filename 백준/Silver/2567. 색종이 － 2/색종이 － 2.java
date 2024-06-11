import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //색종이 수 N 입력
		int N =sc.nextInt();
		int[][] arr = new int [102][102];
        
		int answer = 0;
        
		for(int i=0 ; i<N ; i++) {
			int x =sc.nextInt();
			int y =sc.nextInt();
            
			
			for (int j=92-y ; j<102-y ; j++) {
				for (int k=x ; k<x+10 ; k++) {
					arr[j][k]=1;
				}
			}
		}
	
		for (int i=1 ; i<=100 ; i++) {
			for (int j=1 ; j<=100 ; j++) {
				if(arr[i][j]==1) {
					//상
					if(arr[i-1][j]==0) answer++;
					//하
					if(arr[i+1][j]==0) answer++;
					//좌
					if(arr[i][j-1]==0) answer++;
					//우
					if(arr[i][j+1]==0) answer++;
				}
			}
		}
		System.out.println(answer);

    }
}