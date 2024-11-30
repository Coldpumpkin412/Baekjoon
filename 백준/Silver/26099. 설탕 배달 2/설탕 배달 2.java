import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        //N 입력
		long N = sc.nextLong();
        
		long count = 0;
		
		//5로 나눠지지 않을 때까지 3을 빼준다.
		while(N%5!=0 && N>0) {
			N -= 3;
			count++;
		}
				
		if(N%5 == 0) {
            count += N/5;
        }else {
            count = -1;
        }
		
		System.out.println(count);

	}
}