import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            //N 입력
            int N = Integer.parseInt(br.readLine());
            
            int square = N*N;
            
            boolean check = false;
            
            while(N!=0) {
                int a = N % 10;
                int b = square % 10;
                
                if(a!=b) {
                    sb.append("NO\n");
                    check = true;
                    break;
                }
                N /= 10;
                square /= 10;
            }
            if(!check) {
                sb.append("YES\n");
            }
        }
        System.out.print(sb.toString());
    }
}