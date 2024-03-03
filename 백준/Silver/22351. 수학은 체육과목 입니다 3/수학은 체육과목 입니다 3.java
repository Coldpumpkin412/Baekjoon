import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
        
        //문자열 S 입력
		String S = br.readLine();
		
		int index = 1;
		if(S.length() < 4) {
			char c = S.charAt(0);
            
			for(; index<S.length() ; index++) {
				if(S.charAt(index) != c) {
					break;
				}
			}
		}
		
		
		if(index == S.length()) {
			sb.append(S + " " + S);
		}else {
			for(int i=1 ; i<=999 ; i++) {
				if(S.startsWith(Integer.toString(i))) {
					String str = S;
                    
					for(int j=i ; j<=999 ; j++) {
						if(str.startsWith(Integer.toString(j))) {
							str = str.substring(Integer.toString(j).length());
						}else {
							break;
						}
                        
						if(str.length() == 0) {
							sb.append(i + " " + j);
							break;
						}
					}
                    
					if(sb.length() != 0) {
						break;
					}
				}
			}
		}
		System.out.print(sb);
	}
}