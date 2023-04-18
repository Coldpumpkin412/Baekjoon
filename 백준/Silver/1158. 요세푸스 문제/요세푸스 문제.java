import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //활용할 큐 선언
        Queue<Integer> queue = new LinkedList<>();
        
        //사람수N, 제거되는 순서K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        //큐에 1~N까지 값 넣기.
        for (int i=1 ; i<=N ; i++) {
            queue.offer(i);
        }
        //정답 춫ㄹ력에 필요한 열린꺽쇠
        sb.append("<");
        
        //큐의 사이즈가 1일 때까지 반복
        while(queue.size() != 1) {
            
            // K-1번째까지 처음에 있던 값을 맨 뒤로 보낸다.
            for (int i=0; i<K-1 ; i++) {
                queue.offer(queue.poll());
            }
            
            // K번째 값은 빼준 후 출력한다.
            sb.append(queue.poll() + ", ");
        }
        
        //반복문 빠져나온 후 헤드값 출력 후 닫힌꺽쇠
        sb.append(queue.poll() + ">");
        
        System.out.println(sb.toString());
    }
}
