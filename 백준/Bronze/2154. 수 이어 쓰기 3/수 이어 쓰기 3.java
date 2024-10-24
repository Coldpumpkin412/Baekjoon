import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i=1 ; i<=N ; i++) {
            sb.append(i);
        }
        
        System.out.println(sb.toString().indexOf(String.valueOf(N))+1);
    }
}