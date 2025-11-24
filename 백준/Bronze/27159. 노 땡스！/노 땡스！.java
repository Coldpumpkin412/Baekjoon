import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int sum = 0;
        sum += arr[0];  

        for(int i=1 ; i<N ; i++) {
            if (arr[i-1] != arr[i]-1)
                sum += arr[i]; 
        }
        
        System.out.println(sum);
    }
}