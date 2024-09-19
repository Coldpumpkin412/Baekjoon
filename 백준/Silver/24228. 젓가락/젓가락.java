import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N, R 입력
        st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long R = Long.parseLong(st.nextToken());

        System.out.println(N+1 + 2*(R-1));
    }
}