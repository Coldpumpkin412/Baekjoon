import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double N = Integer.parseInt(br.readLine());
		
		double answer = (Math.sqrt(3) / 4) * Math.pow(N, 2);
		
		System.out.println(answer);
	}

}