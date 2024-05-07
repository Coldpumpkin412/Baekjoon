import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //집의 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //집위치 입력
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());       
        for(int i=0 ; i<N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //정렬
        Arrays.sort(arr);
        
        System.out.println(arr[(N-1)/2]);
    }
}