import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        
        char start = 'A';
        int time = 0;
        
        for(int i=0 ; i<word.length() ; i++) {
            char c = word.charAt(i);
            int tmp = Math.abs(c - start);
            
            time += Math.min(tmp, 26-tmp);
            start = c;
        }
        
        System.out.print(time + "\n");
	}

}