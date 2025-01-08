import java.util.*;
import java.io.*;
import java.math.*;

public class Main {	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//A, B 입력
    	st = new StringTokenizer(br.readLine());
    	BigInteger A = new BigInteger(st.nextToken());
    	BigInteger B = new BigInteger(st.nextToken());
    	
    	System.out.println(A.add(B));
    }
}
