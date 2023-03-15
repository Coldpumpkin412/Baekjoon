import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//중복을 제거 후 개수를 세기때문에 해시셋 선언
		Set<String> set = new  HashSet<>();
		
		String str = br.readLine();
		
		//잘린 문자열을 저장할 문자열 선언
		String save = "";
		
		for(int i=0 ; i<str.length() ; i++) {
			save = "";
			
			for(int j=i ; j<str.length() ; j++) {
				save += str.substring(j,j+1);
				set.add(save);
			}
		}

		System.out.println(set.size());
	}
}

	
