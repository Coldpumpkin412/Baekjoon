import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            
            br.readLine(); 
            
            int N = Integer.parseInt(br.readLine());

            BigInteger sum = new BigInteger("0");
            
            for(int i=0 ; i<N ; i++){
                sum = sum.add(BigInteger.valueOf(Long.parseLong(br.readLine())));
            }
            
            System.out.println((String.valueOf(sum.remainder(BigInteger.valueOf(N))).equals("0")) ? "YES" : "NO");
        }
    }
}