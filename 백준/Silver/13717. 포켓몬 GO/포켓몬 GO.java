import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //포켓몬 종류 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        int max = -1;
        int cntSum = 0;
        
        String maxName = null;
        
        while(N-->0) {
            //이름 입력
            String name = br.readLine();
            
            int count = 0;
            
            //K, M 입력
            st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            while(M >= K) {
                int cur = M/K;
                
                count += cur;
                M %= K;
                M += cur*2;
            }
            
            cntSum += count;
            
            if(max < count) {
                max = count;
                maxName = name;
            }
        }
        
        System.out.println(String.format("%d\n%s", cntSum, maxName));
    }
}