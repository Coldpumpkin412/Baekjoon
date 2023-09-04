import java.util.Scanner;
import java.io.*;

public class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
        //테스트케이스 개수 T 입력
		int T = sc.nextInt();
 
		while (T-->0) {
            //규현의 좌표 및 목표물까지 거리 입력
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
            
            //승환의 좌표 및 목표물까지 거리 입력
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();
			
			System.out.println(point(x1, y1, r1, x2, y2, r2));
		}
 
	}
 
 
	//접점 개수 구하는 함수
	public static int point(int x1, int y1, int r1, int x2, int y2, int r2) {
        
        //거리
		int distance = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));	
 
 
		//중점이 같으면서 반지름도 같을 경우
		if(x1==x2 && y1==y2 && r1==r2) {
			return -1;
		}else if(distance > Math.pow(r1 + r2, 2)) {
            //반지름 합 > 거리
			return 0;
		}else if(distance < Math.pow(r2 - r1, 2)) {
            //내접하지 않을 때
			return 0;
		}else if(distance == Math.pow(r2 - r1, 2)) {
            //내접할 때
			return 1;
		}else if(distance == Math.pow(r1 + r2, 2)) {
            //외접할 때
			return 1;
		}else {
            //거리<반지름 합
			return 2;
		}
		
	}
 
}