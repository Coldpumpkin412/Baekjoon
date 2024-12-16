import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //나무 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        int max = 0;
        
        //레몬 수 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            int now = Integer.parseInt(st.nextToken()) - N + i;
            max = Math.max(max, now);
        }

        System.out.print(max);
    }
}