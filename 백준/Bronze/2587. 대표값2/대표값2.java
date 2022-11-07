import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] sort = new int[5];
		int sum=0; //평균값 구할 때 사용할 저장변수
		int mid; //중앙값
		int tmp; //중앙값을 구하기 위해 정렬에 사용될 변수
		//입력할 숫자는 5개로 고정 돼있으므로 배열에 저장
		for(int i=0 ; i<5 ; i++) {
			sort[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<4 ; i++) {
			for(int j=i+1 ; j<5 ; j++) {
				if(sort[i]>=sort[j]) {
					tmp = sort[i];
					sort[i] = sort[j];
					sort[j] = tmp;
				}
			}
		} //배열 오름차순 정렬
		
		
		//평균값 구하기
		for(int i=0 ; i<5 ; i++) {
			sum += sort[i];
		}
		
		System.out.println(sum/5); //평균값 출력
		System.out.println(sort[2]); //중앙값 출력
		
	}

}