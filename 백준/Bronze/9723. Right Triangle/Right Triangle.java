import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=1 ; i<=T ; i++) {
            int[] arr = new int[3];
            
            st = new StringTokenizer(br.readLine());
            for(int j=0 ; j<3 ; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(arr);
            
            boolean answer = arr[2]*arr[2] == (arr[0]*arr[0] + arr[1]*arr[1]);
            
            sb.append(String.format("Case #%d: %s\n", i, answer ? "YES" : "NO"));
        }
        System.out.println(sb.toString());
    }
}