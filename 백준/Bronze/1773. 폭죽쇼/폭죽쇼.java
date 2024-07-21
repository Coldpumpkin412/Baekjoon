import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //학생 수 N, 폭죽쇼 끝나는시간 C 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[C+1];
        
        int count = 0;
        
        for(int i=0 ; i<N ; i++) {
            //폭죽 터뜨리는 주기 입력
            int period = Integer.parseInt(br.readLine());
            
            for(int j=period ; j<=C ; j+=period) {
                if(arr[j] == 0) {
                    arr[j] = 1;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}