import java.io.*;
import java.math.*;

public class Main {
    public static BigInteger fac(int A, int N) {
		BigInteger num = BigInteger.valueOf(A);
		if(A < N) {
			int B = (A + N) / 2;
			num = fac(A, B).multiply(fac(B+1, N));
		}
        
		return num;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int N = Integer.parseInt(br.readLine());

		System.out.println(fac(1, N));
	}

	
}