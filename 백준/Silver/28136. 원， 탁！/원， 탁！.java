import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //접시 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //큐 선언
        Queue<Integer> queue = new LinkedList<>();
        
        //최솟값 초기값
        int min = 10000000;
        
        //a 입력
        st = new StringTokenizer(br.readLine());
        while(N-->0){
            int a = Integer.parseInt(st.nextToken());
            
            //큐에 삽입 후 최솟값 초기화
            queue.offer(a);
            min = Math.min(min, a);
        }
        
        while(true){
            if(queue.peek() == min){
                break;
            }
            
            queue.offer(queue.poll());
        }

        int answer = 1;
        int num = queue.poll();
        
        while(queue.size() != 0){
            if(queue.peek() <= num){
                answer++;
                num = queue.poll();
            }else{
                num = queue.poll();
            }
        }
        System.out.println(answer);
    }
}