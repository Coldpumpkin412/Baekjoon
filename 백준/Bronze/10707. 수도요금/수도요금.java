import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
        
		int X = A * P;
		int Y = 0;
		
		if(C >= P) {
			Y = B;
		}else {
			Y = B + ((P - C) * D);
		}
        
		if(X < Y) {
			System.out.println(X);
		}else {
			System.out.println(Y);
		}
	}

}