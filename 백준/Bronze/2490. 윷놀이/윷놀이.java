import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; 
        StringBuilder sb = new StringBuilder();
        
        String[] arr = {"D", "C", "B", "A", "E"};
        
        
        for(int i=0; i < 3; i++) {
            int sum = 0;
            
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }
            
            sb.append(arr[sum] + "\n");
        }
        System.out.print(sb.toString());
    }
}