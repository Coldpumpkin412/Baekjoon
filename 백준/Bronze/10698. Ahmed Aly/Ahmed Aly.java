import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());

		for(int i=0 ; i<N ; i++) {
			String[] str = sc.nextLine().split(" ");

			int num1 = Integer.parseInt(str[0]);
			int num2 = Integer.parseInt(str[2]);
			int num3 = Integer.parseInt(str[4]);
            
			int sum = 0;

			if(str[1].equals("+")){
				sum = num1 + num2;
			}else if(str[1].equals("-")){
				sum = num1 - num2;
			}

			System.out.println("Case " + (i+1) + ": " + (sum==num3 ? "YES" : "NO"));
		}
        
	}
}