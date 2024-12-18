import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//N 입력
    	int N = Integer.parseInt(br.readLine());
    	
    	//1번 경우
    	double num1 = N * 0.78;
    	
    	//2번 경우
    	double num2 = N * 0.8 + 0.2 * N * 0.78;
    	
    	System.out.println((int)num1 + " " + (int)num2);
    }
}
