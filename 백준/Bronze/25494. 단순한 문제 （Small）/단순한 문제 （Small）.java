import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            //A, B, C 입력
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
                        
            int count = 0;
            for(int i=1 ; i<=A ; i++) {
                for(int j=1 ; j<=B ; j++) {
                    for(int k=1 ; k<=C ; k++) {
                        if(i%j==j%k && j%k==k%i && i%j==k%i) {
                            count++;
                        }
                    }
                }
            }
            sb.append(count).append('\n');
        }
        
        System.out.println(sb.toString());
    }
}