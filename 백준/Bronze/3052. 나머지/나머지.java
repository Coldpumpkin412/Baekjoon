import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] division = new int[10];
		int p; //배열에 입력될 정수
		boolean bl;
		int count = 0; //서로 다른 나머지 회수
		
		
		for (int i=0 ; i<10 ; i++) {
			p = sc.nextInt();
			division[i] = p;
		}
		
		for(int i=0 ; i<10 ; i++) {
			division[i] = division[i] % 42;
		}
		
		for(int i=0 ; i<10 ; i++) {
			bl = false;
			for(int j=i+1 ; j<10 ; j++) {
				if(division[i] == division[j]) {
					bl = true;
					break;
				}
			}
			if(bl == false) count++;
		}
		System.out.println(count);
		
	}
}