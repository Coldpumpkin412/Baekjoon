import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N 입력
        int N = Integer.parseInt(br.readLine());

        //이니셜 저장 큐
        Queue<String> queue = new LinkedList<>();
        
        //학번 저장 큐
        Queue<Integer> num = new LinkedList<>();

        for(int i=0 ; i<N ; i++) {
            st = new StringTokenizer(br.readLine());
            
            //이니셜 및 학번 큐에 넣기            
            queue.add(st.nextToken());
            num.add(Integer.parseInt(st.nextToken()));
        }

        while(queue.size() > 1) {
            queue.poll();
            
            int numberOfPass = (num.poll()-1) % queue.size();
            
            while(numberOfPass != 0) {
                queue.add(queue.poll());
                num.add(num.poll());
                
                numberOfPass--;
            }
            queue.poll();
            num.poll();
        }

        System.out.println(queue.poll());
        num.poll();
    }
}