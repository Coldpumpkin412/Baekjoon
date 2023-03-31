import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		for(int i=0 ; i<str.length() ; i++) {
			//대문자인 경우
			if(Character.isUpperCase(str.charAt(i))) {
				System.out.print(Character.toString(str.charAt(i)).toLowerCase());
			}else {
				System.out.print(Character.toString(str.charAt(i)).toUpperCase());
			}
		}
	}
}

	
