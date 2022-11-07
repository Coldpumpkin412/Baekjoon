import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //입력할 수의 개수
		int[] sort = new int[N]; //정렬을 실시할 배열
		int tmp; //변경시 사용할 변수
		
		
		for(int i=0 ; i<N ; i++) {
			sort[i] = sc.nextInt(); //배열에 정수입력
		}
		
		for(int i=0 ; i<N-1 ; i++) {
			for(int j=i+1 ; j<N ; j++) {
				if(sort[i] > sort[j]) {
					tmp = sort[i];
					sort[i] = sort[j];
					sort[j] = tmp;
				}
			}
		}
		for(int i=0 ; i<N ; i++) {
			System.out.println(sort[i]);
		}
		
		sc.close();
	}
}