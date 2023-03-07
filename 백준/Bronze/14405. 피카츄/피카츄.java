import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		//pi, ka, chu 를 대체 (공백 주의)
		str = str.replaceAll("pi|ka|chu", "");
		
		if(str.equals("")) {
			//문자열이 비어있다면 모두 대체된것이므로 YES
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}

	
