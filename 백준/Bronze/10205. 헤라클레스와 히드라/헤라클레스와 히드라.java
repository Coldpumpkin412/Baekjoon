import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int T = Integer.parseInt(br.readLine());
		
        for(int i=1 ; i<=T ; i++) {
			int c = Integer.parseInt(br.readLine());
            
			String str = br.readLine();
            
			int size = str.length();
            
			for(int j=0 ; j<size ; j++) {
                c += (str.charAt(j)=='c') ? 1 : -1;
            }
            
			if(i != 1) {
                sb.append("\n");
            }
			sb.append("Data Set "+i+":\n"+c+"\n");
		}
		System.out.println(sb.toString());
	}
}