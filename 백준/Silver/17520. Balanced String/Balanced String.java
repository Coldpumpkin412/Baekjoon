import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			int N = Integer.parseInt(br.readLine());
			int answer = 1;
			int power = (N%2 == 0) ? N/2 : N/2 + 1;
			
			for(int i=0 ; i<power ; i++) {
				answer = (answer *2) % 16769023;
			}
			
			System.out.println(answer);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}