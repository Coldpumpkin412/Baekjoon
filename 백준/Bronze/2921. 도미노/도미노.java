import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int sum = 0;
        
        for(int i=0 ; i<=N ; i++) {
            for(int j=i ; j<=N ; j++) {
                sum += i;
                sum += j;
            }
        }
        
        System.out.println(sum);
    }
     
}