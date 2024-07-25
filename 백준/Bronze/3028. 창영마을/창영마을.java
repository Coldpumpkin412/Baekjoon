import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String S = br.readLine();
        
		//O : 공의 위치
		List<String> list = new ArrayList<String>(Arrays.asList("O", "X", "X"));
				
		for(int i=0 ; i<S.length() ; i++) {
			if(S.charAt(i) == 'A') {
				//두 인덱스 값의 위치를 바꾸기
				Collections.swap(list, 0, 1);
			}else if(S.charAt(i) == 'B') {
				Collections.swap(list, 1, 2);
			}else if(S.charAt(i) == 'C') {
				Collections.swap(list, 0, 2);
			}
		}
		
		System.out.println(list.indexOf("O") + 1);
	}

}