import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            //X 입력
            long X = Long.parseLong(br.readLine());
            
            boolean[] arr = new boolean[10];
            
            while(X != 0){
                arr[(int)(X % 10L)] = true;
                X /= 10;
            }
            
            int count = 0;
            for(int i=0 ; i<10 ; i++){
                if(arr[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}