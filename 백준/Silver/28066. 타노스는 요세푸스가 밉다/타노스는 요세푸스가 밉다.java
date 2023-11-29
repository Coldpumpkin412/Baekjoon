import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N, K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        //데크 선언 및 값 입력
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=1 ; i<=N ; i++){
            deque.addLast(i);
        }

        
        while(K <= deque.size()){
            //첫원소를 뺀 후 맨 뒤에 넣어주기
            deque.addLast(deque.pollFirst());
            
            for(int i=1 ; i<K ; i++) {
                deque.pollFirst();
            }
        }
        
        //첫 원소 출력
        System.out.print(deque.peekFirst());

    }
	
}