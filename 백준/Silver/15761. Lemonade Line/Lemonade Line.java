import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N =Integer.parseInt(br.readLine());
        
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<arr.length ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int count = 0;
        for(int i=N-1 ; i>=0 ; i--, count++) {
            if (arr[i] < count) {
                break;
            }
        }

        System.out.println(count);
    }
}