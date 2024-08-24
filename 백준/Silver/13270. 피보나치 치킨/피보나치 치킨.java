import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //사람수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //피보나치 수열 1, 2항
        int f1 = 1; 
        int f2 = 2;
        
        //최소 치킨 수, 최대 치킨 수 배열 선언
        int[] min = new int[N+1]; 
        int[] max = new int[N+1]; 

        //초기값
        for(int i=1 ; i<=N ; i++) {
            min[i] = 987654321;
        }

        while(f2 <= N) {
            for(int i=f2 ; i<=N ; i++) {
                min[i] = Math.min(min[i], min[i-f2] + f1);
                max[i] = Math.max(max[i], max[i-f2] + f1);
            }
            
            int tmp = f2;
            f2 += f1;
            f1 = tmp;
        }
        
        //최소, 최대 출력
        System.out.println(min[N] + " " + max[N]);
    }
}