import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //테스트케이스 개수 T 입력        
        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            int answer = 1;

            //정류장 수 K 입력
            int K = Integer.parseInt(br.readLine());

            for(int i=1 ; i<K ; i++) {
                answer = (answer * 2) + 1;
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb.toString());
    }
}