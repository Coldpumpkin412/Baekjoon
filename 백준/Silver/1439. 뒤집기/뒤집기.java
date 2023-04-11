import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		/*
		 * 연속된 1로 구성되어있는 것의 개수와 연속된 0으로 구성되어있는것의 개수 중 작은것이 답이다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		StringTokenizer st0 = new StringTokenizer(S, "0");
		StringTokenizer st1 = new StringTokenizer(S, "1");
		
		System.out.println(Math.min(st0.countTokens(), st1.countTokens()));
	}
}

	
