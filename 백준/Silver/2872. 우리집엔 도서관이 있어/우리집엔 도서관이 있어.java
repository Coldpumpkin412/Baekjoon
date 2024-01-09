import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //책의 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //책 배열 선언
        int[] arr = new int[N];
        
        int max = N;
        
        //최대 인덱스 초기값
        int index = -1;
        
        //길이 변수
        int length = 1;
        
        for(int i=0 ; i<N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            
            if(arr[i] == N) {
                index = i;
            }
        }
        
        for(int i=index ; i>=0 ; i--) {
            if(arr[i] == max-1) {
                max--;
                length++;
            }
        }
        System.out.println(N-length);
    }
}