import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringBuilder sb = new StringBuilder();
        
        br.readLine();        
        String str = br.readLine();
        
        
        if(str.length() <= 25) {
            sb.append(str);
        }else {
            String s = str.substring(12, str.length()-12);
            
            boolean check = true;
            for(char ch : s.toCharArray()) {
                if(ch == '.') {
                    check = false;
                    break;
                }
            }
            sb.append(check ? str.substring(0,11) + "..." + str.substring(str.length()-11) : str.substring(0,9) + "......" + str.substring(str.length()-10));
        }
        
        System.out.print(sb.toString());
    }
}