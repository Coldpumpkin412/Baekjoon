import java.util.*;
import java.io.*;
import java.math.*;


public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력
		BigInteger N = new BigInteger(br.readLine(), 2);
        
		Stack<BigInteger> stack = new Stack<>();
		
		N = N.multiply(BigInteger.valueOf(17));
		
		while(true) {
			stack.push(N.remainder(BigInteger.valueOf(2)));
            
			N = N.divide(BigInteger.valueOf(2));
                        
			if(N.equals(BigInteger.ONE)) {
				stack.push(N);
				break;
			}
		}
        
		while(!stack.isEmpty()) {
			BigInteger answer = stack.pop();
			System.out.print(answer);
		}
	}

}