import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        
        while(true) {
            String s = br.readLine();
            
            if(s.equals("*")) {
                break;
            }
            
            int count = 0;
            int[] arr = new int['Z'-'A'+1];
            
            for(int i=0 ; i<s.length() ; i++) {
                char c = s.charAt(i);
                if(c<'a' || c>'z') {
                    continue;
                }
                if(++arr[c-'a']==1) {
                    count++;
                }
            }
            
            sb.append(count==26 ? 'Y' : 'N').append('\n');
        }
        
        System.out.print(sb);
        
    }
}