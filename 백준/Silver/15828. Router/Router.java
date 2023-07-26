import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 큐 활용하여 풀어주기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //활용할 큐 선언
        Queue<Integer> queue = new LinkedList<>();
        
        //버퍼의 크기 N 입력
        int N = Integer.parseInt(br.readLine());
        
        while (true) {
            //라우터가 처리할 정보 입력(-1이 입력되면 빠져나오기)
            int num = Integer.parseInt(br.readLine());
            
            if (num==-1) {
                break;
            }
            
            //0이 입력되면 제거
            if (num==0) { 
                queue.remove();
            } else if (N>queue.size()) {
                queue.add(num);
            }
        }
        
        //큐가 비어있다면 EMPTY를, 아니라면 답출력
        if (queue.isEmpty()) {
            System.out.print("empty");
        } else {
            for (int value : queue) {
                sb.append(value + " ");
            }
            
            System.out.print(sb);
        }
    }
}