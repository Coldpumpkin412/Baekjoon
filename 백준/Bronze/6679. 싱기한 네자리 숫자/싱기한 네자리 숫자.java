import java.util.*;

public class Main {

	public static void main(String[] args) {
		
        //입력이 주어지지않음
        for(int i=1000 ; i<=9999 ; i++) {
			int sum_10 = 0;
			int sum_12 = 0;
			int sum_16 = 0;
			
			for(int j=i ; j>0 ; j/=10) {
                sum_10 += j%10;
            }
				
			
			for(int j=i ; j>0 ; j/=12) {
                sum_12 += j%12;
            }
				
			
			for(int j=i ; j>0 ; j/=16) {
                sum_16 += j%16;
            }
				
			
			if(sum_10==sum_12 && sum_12==sum_16) {
                System.out.println(i);
            }
				
		}
	}

}