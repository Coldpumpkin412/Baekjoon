import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //문제 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        

        while(N-->0) {
            //문제형식
            String str = br.readLine();

            if (str.equals("P=NP")) {
                sb.append("skipped\n");
            }else {
                st = new StringTokenizer(str, "+");
                int lNum = Integer.parseInt(st.nextToken());
                int rNum = Integer.parseInt(st.nextToken());
                
                sb.append((lNum + rNum) + "\n");
            }
        }

        System.out.println(sb.toString());

    }
}