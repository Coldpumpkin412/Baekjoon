import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); //현재위치이 x좌표
		int y = sc.nextInt(); //현재위치의 y좌표
		int w = sc.nextInt(); //직사각형의 가로길이
		int h = sc.nextInt(); //직사각형의 세로길이
		
		int[] length = {x, y, w-x, h-y}; //좌표와 네 변사이 길이를 저장할 배열
		
		Arrays.sort(length);
		System.out.print(length[0]);

	}
	
}