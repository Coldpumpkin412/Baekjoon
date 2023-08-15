import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //기준 문자열 및 확인할 문자열 입력
		String S = br.readLine();
		String S2 = br.readLine();
        
		//미리 처음의 S 문자열의 길이를 재어준다.
		int size = S.length();
		int size2 = S2.length();
		
		//S2를 지워준다.
		S = S.replace(S2, "");
        
		System.out.println((size - S.length()) / size2);
	}

}