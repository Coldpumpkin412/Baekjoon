import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N ; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
            
			int answer = A + (B / 4) - (B / 7);
            
			System.out.println(answer);
		}
	}
}