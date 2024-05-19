import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] word = "CAMBRIDGE".toCharArray();
		String answer = br.readLine();

		for (int i=0 ; i<word.length ; i++) {
			if (answer.indexOf(word[i]) > -1) {
				answer = answer.replace(String.valueOf(word[i]), "");
			}
		}
		System.out.println(answer);
	}
}