import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String str = br.readLine().substring(0, 5);
		
        int N = Integer.parseInt(br.readLine()); 
		
		int count = 0;
		
		while(N-->0){
			String s = br.readLine().substring(0, 5);
			
			if(str.equals(s)){
				count++;
			}
		}
		
		System.out.println(count);
	}
}