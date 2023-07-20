import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int answer = 0;
        
        //도시의 수(N) 입력 및 거리배열(length), 비용배열(price)선언
        int N = Integer.parseInt(br.readLine());//도시 수
        int[] length = new int[N-1]; //도시 간 거리
        int[] price = new int[N]; //기름 값
        
        //도시의 길이 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N-1 ; i++) {
            length[i] = Integer.parseInt(st.nextToken());
        }
        
        //리터당 가격 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        
        //최솟값 초기화
        int min = price[0];
        for(int i=0 ; i<N-1 ; i++) {
            //최솟값 갱신 후 정답에 더해주기
            min = Math.min(min, price[i]);

            answer += min*length[i];
        }

        System.out.println(answer);
    }
}