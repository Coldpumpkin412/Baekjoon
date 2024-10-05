import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //M, N 입력
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        //방향전환 횟수
        int count = 0;
        
        // 지렁이는 수직 혹은 수평으로 이동
        boolean check = true;
        
        while(true) {
            count++;
            
            if(M<=1 || N<=1) {
                break;
            }
            
            if(check) {
                M--;
            }else {
                N--;
            }
            check = !check;
        }
        
        System.out.print(count);
    }
}