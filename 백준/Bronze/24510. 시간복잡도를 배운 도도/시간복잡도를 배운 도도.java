import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        int max = 0;
        
        while(T-->0) {
            String cur = br.readLine();
            cur = cur.replaceAll("for", ",");
            cur = cur.replaceAll("while", ",");
            
            int count = 0;
            
            for(int i=0 ; i<cur.length() ; i++) {
                if(cur.charAt(i) == ',') {
                    count++;
                }
                    
            }
            max = max < count ? count : max;
        }
        System.out.println(max);
    }
}