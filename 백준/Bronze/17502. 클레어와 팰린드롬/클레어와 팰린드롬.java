import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        char[] arr = br.readLine().toCharArray();
        
        for(int i=0 ; i<N/2+1 ; i++) {
            char cur = 'a';
            
            if(arr[i] != '?') {
                cur = arr[i];
            }
            if(arr[N-i-1] != '?') {
                cur = arr[N-i-1];
            }
            
            arr[i] = arr[N-i-1] = cur;
        }
        
        System.out.println(String.valueOf(arr));
    }
}