import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = br.readLine();

        int max = 0;
        
        for(int i=0 ; i<S.length(); i++) {
            for(int j=i+2 ; j<=S.length() ; j+=2) {
                String subS = S.substring(i, j);
                
                int first = 0;
                int second = 0;

                for(int k=0 ; k<subS.length()/2 ; k++) {                    
                    first += subS.charAt(k) - '0';
                    second += subS.charAt(k+subS.length() / 2) - '0';
                }

            if(first==second && subS.length()>max) {
                max = subS.length();
            }
          }            
        }
        System.out.println(max);    
  }
}