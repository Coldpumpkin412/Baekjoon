import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String input = br.readLine();
        char cur = input.charAt(0);
        
		int answer = 1;
		
		for (int i=1 ; i<input.length() ; i++) {
			char next = input.charAt(i);
            
			if(next-'a' <= cur-'a') {
				answer++;
			}
			cur = next;
		}
		System.out.println(answer);
	}
}