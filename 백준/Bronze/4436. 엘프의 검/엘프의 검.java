import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = null;
		
		while((input=br.readLine()) != (null)) {
			long N = Long.parseLong(input);
			
			HashSet<Character> set = new HashSet<Character>();
            
			for(int i=0 ; i<10 ; i++) {
                set.add((char)(i+'0'));
            }
			
			long k = 0;
            
			while(true) {
				k++;
                
				String str = Long.toString(k*N);
                
				for(int i=0 ; i<str.length() ; i++) {
                    set.remove(str.charAt(i));
                }
                
				if(set.isEmpty()) {
                    break;
                }
			}
			
			System.out.println(k);
		}
		
	}

}