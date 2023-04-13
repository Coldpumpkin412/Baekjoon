import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		//입력되는 숫자가 괴장히 길기때문에 문자열로 받는다.
		String number = sc.next();
		
		for(int i=0 ; i<number.length() ; i++) {
			int tmp = number.charAt(i)-'0'; //아스키 코드 활용하여 정수로 변환
			
			String str = Integer.toBinaryString(tmp);
			
			if(str.length()==3) {
				sb.append(str);
			}else if(str.length()==2 && i!=0) {
				sb.append("0" + str);
			}else if(str.length()==1 && i!= 0) {
				sb.append("00" + str);
			}else sb.append(str);
		}
		
		System.out.println(sb.toString());
	}
}

	
