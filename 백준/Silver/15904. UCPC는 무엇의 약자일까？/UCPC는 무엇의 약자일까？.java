import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //문장 입력
		String arr = br.readLine();
        
        //비교할 배열 값 선언
		char[] UCPC = {'U', 'C', 'P', 'C'};
        
		int index = 0;
		for(int i=0 ; i<arr.length() ; i++) {
			if(UCPC[index] == (arr.charAt(i))) {
				index++;
			}
			if(index == 4) {
				System.out.println("I love UCPC");
				return;
			}
		}
		System.out.println("I hate UCPC");
	}
}