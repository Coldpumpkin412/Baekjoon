import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //선물상자 수 N, 아이들 수 M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        //활용할 우선순위 큐 입력
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        //각 선물상자에 들어있는 선물 개수 입력하여 우선순위 큐에 삽입
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            pq.add(Integer.parseInt(st.nextToken()));
        }
        
        //아이들이 원하는 선물의 개수 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<M ; i++) {
            int cur = Integer.parseInt(st.nextToken());
            
            int max = pq.poll();
            
            //아이들이 실망한 경우 0 출력 후 종료
            if(cur > max) {
                System.out.println(0);
                return;
            }
            
            
            pq.add(max-cur);
        }
        
        System.out.println(1);
    }
}