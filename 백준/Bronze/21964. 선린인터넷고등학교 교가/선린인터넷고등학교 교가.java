import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        
        for(int i=N-5 ; i<N ; i++){
            sb.append(s.charAt(i));
        }
            
        System.out.println(sb.toString());
    }
}