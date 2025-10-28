import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int W = Integer.parseInt(br.readLine());
        int L = Integer.parseInt(br.readLine());
        
        System.out.println(W*L);
    }
}