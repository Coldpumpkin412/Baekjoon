import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int N = Integer.parseInt(br.readLine());
		
        long answer = 0;
        
		for(int i=1 ; i<=N ; i++) {
			answer += i*(N/i);
		}
		System.out.println(answer);
	}
}