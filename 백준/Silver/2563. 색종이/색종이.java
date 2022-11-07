import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(); //첫째줄에 색종이의 수 입력
		
		int[][] square = new int[100][100]; //첫번째 정사각형의 시작점 저장배열
		int result = 0; //정사각형 넓이 저장
		int row,column; //정사각형 시작 좌표

		for(int i=0 ; i<X ; i++) {
			row = sc.nextInt();
			column = sc.nextInt();
			
			for(int j=row ; j<row+10 ; j++) {
				for(int k=column ; k<column+10 ; k++) {
					square[j][k] = 1;
				}
			}
		}
		
		for(int i=0 ; i<square.length ; i++) {
			for(int j=0 ; j<square[i].length ; j++) {
				if(square[i][j]==1) result++;
				else continue;
			}
		}
		System.out.println(result);
		sc.close();
		
	}
}