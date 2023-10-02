import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //N, M 입력 및 책 배열 선언
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] books = new int[N];

        if(N == 0){
            System.out.println(0);
            return;
        }
        
        //책 무게 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            books[i] = Integer.parseInt(st.nextToken());
        }
        
        //박스 및 무게 누적 초기화
        int box = 1;
        int weight = 0;

        for(int i=0 ; i<N ; i++){
            weight += books[i];
                        
            if(weight > M){
                box++;
                weight = books[i];
            }
        }

        System.out.println(box);
    }
}