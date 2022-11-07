import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //지불한 돈
		int C = 1000-N; //거스름돈
		int[] change = {500, 100, 50, 10, 5, 1}; //거스름돈으로 사용될 화폐
		int count = 0; //거스름돈으로 사용된 돈의 개수
		
		for(int i=0 ; i<6 ; i++) {
			 if(C/change[i] == 0) continue; //다음 화폐로 넘어가기
			 else {
				 count += C/change[i];
				 C %= change[i];
			 }
		}
		
		System.out.println(count);
		
	}

}
