import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //중심의 길이 L 입력
        int L = Integer.valueOf(br.readLine());
        
        //비율 R 입력
        int R = Integer.valueOf(br.readLine());
        
        //데크 선언
        Deque<Integer> deque = new ArrayDeque<>();

        while(L > 5) {
            L = R*L/100;
            deque.push(L);
        }

        deque.pop();
        
        int answer = deque.stream().reduce(0, (a, b) -> (a+b) * 2);
        
        System.out.print(answer);
    }
}