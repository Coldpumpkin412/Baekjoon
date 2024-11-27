import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0){
            //닭다리 수 합 N, 닭 수 M 입력
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            System.out.println((2*M-N) + " " + (N-M));
        }
        
        
    }
}
