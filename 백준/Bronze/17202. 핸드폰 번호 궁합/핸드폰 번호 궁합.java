import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //A, B의 핸드폰번호 입력
        String A = br.readLine();
        String B = br.readLine();
        
        String str = "";
        
        for(int i=0 ; i<A.length() ; i++) {
            str += A.charAt(i);
            str += B.charAt(i);
        }
        
        while(str.length() > 2) {
            String S = "";
            
            for (int i=0 ; i<str.length()-1 ; i++) {
                int N = Character.getNumericValue(str.charAt(i)) + Character.getNumericValue(str.charAt(i+1));
                
                S += Integer.toString(N%10);
            }
            
            str = S;
        }
        System.out.print(str);
    }
}