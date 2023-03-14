import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		//입력 문자열은 최대 15글자
		char[][] ch = new char[5][15];
		//입력된 문자열들의 길이 중 최댓값
		int max = 0;
		
		//문자열 입력
		for(int i=0 ; i<5 ; i++) {
			String str = br.readLine();
			
			max = Math.max(max, str.length());
			
			for(int j=0 ; j<str.length() ; j++) ch[i][j] = str.charAt(j);
		}
		
		for(int i=0 ; i<max ; i++) {
			for(int j=0 ; j<5 ; j++) {
				if(ch[j][i] == '\0') {
					continue;
				}
				sb.append(ch[j][i]);
			}
		}
		System.out.println(sb);
	}
}

	
