import java.util.*;
import java.io.*;

public class Main {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            //행번호 열번호 입력
            st = new StringTokenizer(br.readLine(), "RC");
            String R = st.nextToken();
            int C = Integer.parseInt(st.nextToken());
            
            //둘 다 0일경우 루프 빠져나오기
            if(R.equals("0") && C==0) {
                break;
            }

            StringBuilder tmp = new StringBuilder();
            while(C > 0) {
                C--;
                tmp.append((char)('A' + C%26));
                C /= 26;
            }
            
            sb.append(tmp.reverse()).append(R).append('\n');
        }
         
        System.out.print(sb.toString());
    }
}