import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //초 입력
		int[] time = {300, 60, 10}; //A,B,C를 초로 환산하여 배열에 저장
		int[] count = {0, 0, 0}; //A,B,C 사용회수 저장 배열
		
		if(T%10 != 0) System.out.println(-1); //ABC로 표현 불가할 경우 -1출력
		else {
			for(int i=0 ; i<3 ; i++) {
				if(T/time[i] != 0) {
					
					count[i] = count[i] + T/time[i];
					T = T % time[i];

				}


			}
			for(int i=0 ; i<3 ; i++) {
				System.out.print(count[i]+" ");
			}
		}
	}

}
