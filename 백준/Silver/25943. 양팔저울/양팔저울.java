import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //무게 배열 미리 선언
        int[] weight = {100, 50, 20, 10, 5, 2, 1};
        
        //자갈 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //좌우 무게 초기값 선언
        int left = 0;
        int right = 0;
        
        st = new StringTokenizer(br.readLine());
        for (int i=0 ; i<N ; i++) {
            //무게 입력
            int num = Integer.parseInt(st.nextToken());
            
            //더 가벼운 쪽에 무게 더해주기
            if(left <= right) {
                left += num;
            }else {
                right += num;
            }
        }
        
        //좌 우 차이 확인
        int diff = Math.abs(left - right);
        
        //사용해야하는 무게추 개수
        int count = 0;
        
        for (int i : weight) {
            count += diff/i;
            diff %= i;
        }
 
        System.out.println(count);
    }
}