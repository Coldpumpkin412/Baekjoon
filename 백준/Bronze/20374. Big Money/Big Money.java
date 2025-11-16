import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String str;
        long answer = 0;

        while ((str = br.readLine()) != null && !str.isEmpty()) {
            int len = str.length();
            long euro = Long.parseLong(str.substring(0, len-3)) * 100;	
            long cent = Long.parseLong(str.substring(len-2));
            
            answer += euro + cent;
        }

        long X = answer / 100; 
        long Y = answer % 100; 
             
        sb.append(X).append(".");
        
        if(Y < 10) {
            sb.append("0");	
        }
        sb.append(Y);

        System.out.println(sb.toString());
    }
}