import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//X 입력
    	String X = br.readLine();
    	
    	//변환 횟수 count
    	int count = 0;
    	
    	//변환한 숫자가 한 자리 숫자가 될때까지
    	while(X.length() != 1) {
    		count++;
    		
    		//누적합
    		int sum = 0;
    		
    		for(char ch : X.toCharArray()) {
    			sum += ch-'0';
    		}
    		
    		X = Integer.toString(sum);
    	}
    	
        //변환 횟수 및 3의 배수인지 확인
    	if(Integer.parseInt(X)%3 == 0) {
    		System.out.println(count);
    		System.out.println("YES");
    	}else {
    		System.out.println(count);
    		System.out.println("NO");
    	}
    	
    }
}	
