import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());

        while(T-->0) {
            //징검다리 수 N 입력
            long N = Long.parseLong(br.readLine());
            
            long left = 0;
            long right = 1000000000L;
            
            long max = 0;

            while(left<=right) {
                long mid = (left+right) >>> 1;
                long sum = (mid*(mid+1)) / 2;

                if(sum <= N) {
                    //최댓값 갱신
                    max = Math.max(mid, max);
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }

            sb.append(max).append("\n");
        }

        System.out.println(sb.toString());
    }
}