import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //다이나믹프로그래밍 활용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        //다이나믹프로그래밍에 활용할 배열 선언
        int d[] = new int[n+1];

        for (int i=1 ; i<=n ; i++) {
            //초기값
            d[i] = i;
            
            for (int j=1 ; j*j<=i ; j++) {
                if (d[i] > d[i-j*j] + 1) {
                    d[i] = d[i-j*j] + 1;
                }
            }
        }
        System.out.println(d[n]);
    }
}