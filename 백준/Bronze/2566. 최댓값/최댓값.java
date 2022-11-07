import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] Array = new int[9][9]; //81개 수 저장할 배열 추가
		int Max = -1; //최댓값 저장할 변수
		int row = 0, column = 0; //최대값의 행과 열  
		
		for(int i=0 ; i<Array.length ; i++) {
			for(int j=0 ; j<Array[i].length ; j++) {
				
				Array[i][j] = sc.nextInt(); //배열에 수 입력
				
				if(Array[i][j] > Max) {
					Max = Array[i][j]; //최댓값 변경
					row = i+1; //최댓값이 변경됐을때 해당 행
					column = j+1;
				}
				else continue;
			}
		}
		System.out.println(Max);
		System.out.println(row+" "+column);
		
	}
	
}
