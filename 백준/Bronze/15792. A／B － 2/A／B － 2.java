import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //숫자 A, B 입력
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        sb.append(A/B + ".");
        
        A = 10 * (A - B*(A/B));
        int T = 1500;
        
        while (T-->0) {
            sb.append(A/B + "");
            
            A = 10*(A - B*(A/B));
        }
        
        System.out.println(sb.toString());
    }
 
}