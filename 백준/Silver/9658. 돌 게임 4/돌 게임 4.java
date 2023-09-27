import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력
		int N = Integer.parseInt(br.readLine());
        
        //삼항연산자 활용
		System.out.println((N%7==1 || N%7==3) ? "CY" : "SK");
	}
}