import java.util.*;
import java.io.*;

public class Main {
	
	public static int Rex(String number) {
		String str = "";
		
		//입력값이 1글자인경우 그대로 출력(정수형으로 변환 후)
		if(number.length() == 1) return Integer.parseInt(number);
		else if(number.length() == 2) {
			//입력값이 2자리인경우 자리바꿔서 출력
			str = str + number.charAt(1);
			str = str + number.charAt(0);
		}else if(number.length() == 3) {
			//입력값이 3자리인경우 0번째와 2번째 자리바꿔서 출력
			str = str + number.charAt(2);
			str = str + number.charAt(1);
			str = str + number.charAt(0);
		}else {
			//입력값이 4자리라면 0번째와3번째, 1번째와 2번째 자리 바꿔서 출력
			str = str + number.charAt(3);
			str = str + number.charAt(2);
			str = str + number.charAt(1);
			str = str + number.charAt(0);
		}
		return Integer.parseInt(str);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력값을 문자열로 받는다
		String X = sc.next();
		String Y = sc.next();
		//Rev함수 실행 후 더한 값 저장
		int sum = Rex(X)+Rex(Y);
		
		System.out.println(Rex(Integer.toString(sum)));
	}
}

	
