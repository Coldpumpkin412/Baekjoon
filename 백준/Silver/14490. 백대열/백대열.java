import java.util.*;
import java.io.*;

public class Main {
    //최대공약수 구하는 함수(유클리드 호제법 활용)
	public static int GCD(int a, int b) {
		if(b==0) return a;
		
		return GCD(b, a%b);
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String str = sc.next();
    	
    	String[] num = str.split(":");
    	
    	int div = GCD(Integer.parseInt(num[0]), Integer.parseInt(num[1]));
    	
    	System.out.println(Integer.parseInt(num[0])/div+":"+Integer.parseInt(num[1])/div);
    }
}	
