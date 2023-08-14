import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //n 입력
        int n = Integer.parseInt(br.readLine());
        
        for (int i=0 ; i<n ; i++) {
            st = new StringTokenizer(br.readLine());
            
            while (st.hasMoreTokens()) {
                StringBuilder rev = new StringBuilder(st.nextToken());
                
                //각 단어를 뒤집고 answer에 붙이기
                sb.append(rev.reverse() + " "); 
            }
            
            sb.append("\n");
        }
        System.out.print(sb);
    }
}