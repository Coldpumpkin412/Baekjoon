import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            if(num%2 == 0) {
                sum += num;
            }else {
                queue.add(num);
            }
        }

        while(1 < queue.size()) {
            sum += queue.poll() + queue.poll();
        }
        System.out.print(sum);

    }
}