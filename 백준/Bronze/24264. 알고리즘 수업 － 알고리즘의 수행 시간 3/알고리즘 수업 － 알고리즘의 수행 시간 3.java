import java.util.*;


public class Main {
	public static void main(String[] args) {
		/*
         * for문(반복문)이 1부터 n까지 이중으로 돌기 때문에
         * n*n의 시간복잡도를 가지며 최고차항의 차수는 2가 된다
         * 입력값의 범위에 따라 나올 수 있는 값의 범위가 굉장히 커지기 때문에
         * int형이 아닌 long형으로 변수를 받아준다
         *
         * int형의 범위 : -2^31 ~ (2^31 - 1)
         * long형의 범위 : -2^63 ~ (2^63 - 1)
         */
		
		Scanner sc = new Scanner(System.in);
        
		Long n= sc.nextLong();
        
		System.out.println(n*n);
		System.out.println("2");
	}
}

	
