import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //M, N 입력
        int M = Integer.parseInt(br.readLine());  
        int N = Integer.parseInt(br.readLine());  
        
        //최솟값
        int min = (int)Math.ceil(Math.sqrt(M));
        
        //누적합
        int sum = 0;
        
        for(int i=min ; i<=Math.floor(Math.sqrt(N)) ; i++) {
            sum += Math.pow(i, 2);
        }

        if(sum > 0) {
            System.out.println(sum);
            System.out.println((int)Math.pow(min, 2));
        }else {
            System.out.println(-1);
        }

    }
}