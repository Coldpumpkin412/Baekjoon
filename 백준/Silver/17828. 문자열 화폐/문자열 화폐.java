import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //문자열 길이 N, 가치 X 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        //문자열 배열 선언 및 초기화
        char[] arr = new char[N];
        for(int i=0 ; i<N ; i++) {
            arr[i] = 'A';
        }
        
        if(26*N<X || N>X){
            System.out.println("!");
        }else {
            X -= N;
            
            for(int i=N-1 ; i>=0 ; i--) {
                //최솟값
                int min = Math.min(X, 25);
                arr[i] += min;
                X -= min;
            }
            
            System.out.println(arr);
        }
        
    }
}