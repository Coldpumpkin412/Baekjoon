import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int answer = 0;

        int T = Integer.parseInt(br.readLine());
        
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if(N<12 || M<4){
                sb.append(-1).append("\n");
            }else{
                answer = (12*M) - (M-4);
                sb.append(answer).append("\n");
            }
        }
        
        System.out.println(sb.toString());
    }
}