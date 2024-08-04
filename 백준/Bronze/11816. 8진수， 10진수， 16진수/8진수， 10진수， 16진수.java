import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String num = br.readLine();
		
		if(num.charAt(0) != '0') {
			System.out.print(num);
		}else if(num.charAt(1) != 'x') {
			System.out.print(Integer.valueOf(Integer.parseInt(num.substring(1), 8)));
		}else {
			System.out.print(Integer.valueOf(Integer.parseInt(num.substring(2), 16)));
		}
	}

}