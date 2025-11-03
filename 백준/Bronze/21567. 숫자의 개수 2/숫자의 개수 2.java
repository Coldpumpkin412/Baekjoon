import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();
        
		int[] num = new int[10];
        
		BigInteger sum = new BigInteger(br.readLine()).multiply(new BigInteger(br.readLine())).multiply(new BigInteger(br.readLine()));
		
		while(sum.compareTo(BigInteger.ZERO) != 0) {
			num[sum.remainder(BigInteger.TEN).intValue()]++;
            
			sum = sum.divide(BigInteger.TEN);
		}
				
		for(int n : num) {
			sb.append(n).append("\n");
		}
        
		System.out.print(sb.toString());
	}
}