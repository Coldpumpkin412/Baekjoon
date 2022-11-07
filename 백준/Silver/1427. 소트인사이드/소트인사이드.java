import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next(); //숫자를 문자열로 입력받기
		int[] arr = new int[N.length()]; //각 자리 숫자를 저장할 배열
		int tmp; //정렬에 사용될변수
		for(int i=0 ; i<N.length() ; i++) {
			arr[i] = (int)(N.charAt(i)-'0'); //각 자리별 숫자를 int형으로 변환 후 배열에 저장
		}
		
		for(int i=0 ; i<N.length()-1 ; i++) {
			for(int j=i ; j<N.length() ; j++) {
				if(arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp; //내림차순으로 정렬
				}
			}
		}
		
		for(int i=0 ; i<N.length() ; i++) {
			System.out.print(arr[i]);
		}
	}

}