import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(arithmetic(sc.nextInt()));
		
		sc.close();
	}
	
	public static int arithmetic(int num) {
		int result = 0;
		
		if(num<100) return num;
		else {
			result = 99;
			
			for(int i=100 ; i<=num ; i++) {
				int hun = i / 100; // 백의자리 인수 저장
				int ten = (i/10)%10; // 십의자리 인수 저장
				int one = i%10; //일의자리 인수 저장
				
				if((hun-ten) == (ten-one)) result++;
						
			}
		}
		
		return result;
	}
	
}
