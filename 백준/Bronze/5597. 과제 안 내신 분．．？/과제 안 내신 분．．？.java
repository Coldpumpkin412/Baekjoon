import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				        11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				        21, 22, 23, 24, 25, 26, 27, 28, 29, 30}; //학번 저장용
		int k; //학번 입력용
		
		for(int j = 0 ; j<28 ; j++) {
			k = sc.nextInt();
			for(int i=0 ; i<30 ; i++) {
				if(number[i] == k) {
					number[i] = 0;
				}
				else continue;
			}
		}
		
		for( int i = 0 ; i<30 ; i++) {
			if(number[i] != 0) {
				System.out.println(number[i]);
			}
			else continue;
			
		}
	}
}
