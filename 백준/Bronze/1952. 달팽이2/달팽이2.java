import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //M, N 입력
        st  = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
                
        if(M <= N){
            sb.append(2*(M-1));
        }else{
            sb.append(2*(N-1)+1);
        }
        
        System.out.println(sb.toString());
    }
}