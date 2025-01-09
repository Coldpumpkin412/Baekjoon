import java.util.*;
import java.io.*;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            //N 입력
            int N = Integer.parseInt(br.readLine());

            if(N == 1) {
                sb.append(0);
            }else if(N%2 == 0) {
                String str = Integer.toString(9).repeat(N);
                
                sb.append(str);
                
            }else if(N%2 != 0) {
                String str = Integer.toString(1) + Integer.toString(2).repeat(N-2) + Integer.toString(1);
                sb.append(str);
            }

            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}