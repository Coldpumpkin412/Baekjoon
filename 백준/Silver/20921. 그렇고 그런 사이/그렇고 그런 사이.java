import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //정수 N, K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
 
        int sum = 0;
        int index = N-1;
        boolean[] check = new boolean[N];
 
        while(index > 0) {
            if(sum+index <= K) {
                sum += index;
                check[index] = true;
            }
            index--;
        }
 
        for(int i=N-1 ; i>=0 ; i--) {
            if(check[i]) {
                System.out.print(i+1 + " ");
            }
        }
        for(int i=0 ; i<N ; i++) {
            if(!check[i]) {
                System.out.print(i+1 + " ");
            }
        }
        
    }
}