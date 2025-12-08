import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String str = br.readLine();
            if(str == null) {
                break;
            }
            
            sb.append(str).append('\n');
        }
        System.out.print(sb.toString());
    }     
}