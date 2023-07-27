import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N입력
		String N = br.readLine();
				
		while(true) {			
			boolean check = true;
			
			for(int i=0 ; i<N.length() ; i++) {
                //해당 인덱스에 4, 7 둘다 아닌경우
				if(N.charAt(i)!='4' && N.charAt(i)!='7') {
					check = false;
					break;
				}
			}
			
			if(check==true) {
                break;
            } else {
              N = String.valueOf(Integer.parseInt(N)-1);  
            } 
		}
		System.out.println(N);
	}

}