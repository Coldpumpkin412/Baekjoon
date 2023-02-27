import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count_two = 0;
		int count_five = 0;
		
		int N = Integer.parseInt(br.readLine());
		
		//입력값을 소인수분해 하여 2와 5의 개수를 확인
		for(int i=1 ; i<=N ; i++) {
			int number = i;
			
			while(number%2 == 0) {
				count_two++;
				number /= 2;
			}
			
			while(number%5 == 0) {
				count_five++;
				number /= 5;
			}
		}
		
		//두 개의 개수중 최소값이 0의 개수
		System.out.println(Math.min(count_two, count_five));
		
	}
}

	
