import java.util.*;
import java.math.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//정수 N 문자열 형식으로 입력 후 빅인티저로 변환
    	BigInteger N = new BigInteger(br.readLine());
    	
    	System.out.println(N.sqrt());
    }
}	
