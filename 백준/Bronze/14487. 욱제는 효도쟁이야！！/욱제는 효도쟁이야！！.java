import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //마을 수 N 입력
        int n = Integer.parseInt(br.readLine());
        
        int sum = 0;
        int max = 0;
        
        //비용 입력
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            
            //누적 합
            sum += num;
            
            //최댓값 갱신
            max = Math.max(max, num);
        }
        
        sum -= max;
        
        System.out.print(sum);
    }
}