import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        //n 입력
        int n = Integer.parseInt(br.readLine());
        
        //t배열 선언
        long[] t = new long[n + 2];
        
        //초기값 입력
        t[0] = 1;
        t[1] = 1;
        
        for (int i=2 ; i<=n ; i++) {
            for (int j=0 ; j<i ; j++) {
                t[i] += t[j] * t[i-1-j];
            }
        }
 
        System.out.println(t[n]);
    }
}