import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//전구 상태 입력
        String S = br.readLine();
        
        boolean[] check = new boolean[S.length()+1];
        
        for (int i=0 ; i<S.length( ); i++) {
        	check[i+1] = S.charAt(i) == 'Y';
        }
            
        int count = 0;
        
        for (int i=1 ; i<check.length ; i++) {
            if (!check[i]) {
            	continue;
            }
            
            count++;
            
            for (int j=i ; j<check.length ; j+=i) {
            	check[j] = !check[j];
            }
        }

        System.out.println(count);
    }
}	
