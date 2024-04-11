import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        // 카드의 수 N 입력
        int N = Integer.parseInt(br.readLine());

        // 역순으로 주어진 기술들을 역으로 Deque에 저장
        st = new StringTokenizer(new StringBuilder(br.readLine()).reverse().toString());
        Deque<Integer> deque = new LinkedList<>();

       
        for (int i=1 ; i<=N ; i++) {
            int num = Integer.parseInt(st.nextToken());

            //기술에 따라 카드를 Deque의 앞쪽, 뒤쪽에 추가 또는 이동
            if(num == 1) {
                deque.addFirst(i);
            }else if(num == 2) {
                int top = deque.removeFirst();
                
                deque.addFirst(i);
                deque.addFirst(top);
            }else {
                deque.addLast(i);
            }
        }

        //결과출력
        while(deque.size() != 0) {
            sb.append(deque.removeFirst() + " ");
        }

        System.out.println(sb.toString());
    }
}