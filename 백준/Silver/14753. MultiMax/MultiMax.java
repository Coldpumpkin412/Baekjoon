import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
            
        Arrays.sort(arr);

        int max = Math.max(arr[--N]*arr[N-1]*arr[N-2], Math.max(arr[N]*arr[1]*arr[0], Math.max(arr[N]*arr[N-1], arr[0]*arr[1])));

        System.out.println(String.valueOf(max));
    }

}