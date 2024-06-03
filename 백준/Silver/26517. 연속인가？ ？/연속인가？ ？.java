import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	//정수 k 입력
    	long k = Long.parseLong(br.readLine());
    	
    	//정수 a, b, c, d 입력
    	st = new StringTokenizer(br.readLine());
    	long a = Long.parseLong(st.nextToken());
    	long b = Long.parseLong(st.nextToken());
    	long c = Long.parseLong(st.nextToken());
    	long d = Long.parseLong(st.nextToken());
    	
    	//f(x)가 k에서 연속이려면 a*k+b의 값과 c*k+d의 값이 같아야한다
    	if(a*k+b == c*k+d) {
    		System.out.print("Yes ");
    		System.out.print(a*k + b);
    	}else {
    		System.out.println("No");
    	}
    }
}	
