import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //수의 개수 N개 입력
		int[] number = new int[N];
		int count = 0;
		
		for(int i=0 ; i<N ; i++) {
			number[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<N ; i++) {
			loop:
			if(number[i] == 2) count++;
			else if((number[i] != 1) && (number[i] != 2)) {
				for(int j=2 ; j<number[i] ; j++) {
					if((number[i]%j)!=0) continue;
					else break loop;
				}
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
