import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//첫번째 분수의 분자 및 분모 입력
		st = new StringTokenizer(br.readLine());
		int numer1 = Integer.parseInt(st.nextToken()); 
		int denom1 = Integer.parseInt(st.nextToken());
		
		//두번째 분수의 분자 및 분모 입력
		st = new StringTokenizer(br.readLine());
		int numer2 = Integer.parseInt(st.nextToken());
		int denom2 = Integer.parseInt(st.nextToken());
		
		
        int num1 = (numer1 * denom2) + (numer2 * denom1); //분자
        int num2 = denom1 * denom2; //분모
        
        //기약분수로 만들기(분자, 분모 동시에 나누어지는 수가 있으면 나누어주기)
        for(int i = num1-1; i > 1; i--) {
            if(num1 % i == 0 && num2 % i == 0) { 
                num1 /= i;
                num2 /= i;
            }
        }
        
        System.out.println(num1 + " " + num2);
	}
}

	
