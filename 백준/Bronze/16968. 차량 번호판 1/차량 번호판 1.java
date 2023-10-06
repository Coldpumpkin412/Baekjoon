import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //입력값을 char배열로 전환
		char[] car = sc.next().toCharArray();
        
        //정답 초기값
		int answer = 1;
        
		for (int i=0 ; i<car.length ; i++) {
			if (i == 0) { //첫번째 숫자            
				if (car[i] == 'c') {
					answer *= 26;
				} else {
					answer *= 10;
				}
			} else { //두번째 숫자            
				if (car[i] == car[i-1]) {
					if (car[i] == 'c') {
						answer *= 25;
					} else {
						answer *= 9;
					}
				} else {
					if (car[i] == 'c') {
						answer *= 26;
					} else {
						answer *= 10;
					}
				}
			}
		}
    
		System.out.println(answer);
	}
}