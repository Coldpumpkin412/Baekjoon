import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String sentence = br.readLine();
		String answer = "";
		
		String[] str = sentence.split("-");
		
		for(String s : str) {
			answer += s.charAt(0);
		}
		
		System.out.println(answer);
	}
}	