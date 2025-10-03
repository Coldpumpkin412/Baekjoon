import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
    
		while(T-->0){
			BigInteger N = new BigInteger(br.readLine());
            
			System.out.println(N.multiply(N));            
		}
	}
}