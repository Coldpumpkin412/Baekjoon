import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int W = Integer.parseInt(br.readLine());
		int P = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		if(M >= W) {
			System.out.println("Watermelon");
		}else if(M >= P) {
			System.out.println("Pomegranates");
		}else if(M >= N) {
			System.out.println("Nuts");
		}else {
			System.out.println("Nothing");
		}
        
	}
}