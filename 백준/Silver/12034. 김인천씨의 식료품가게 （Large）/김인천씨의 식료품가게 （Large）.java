import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        int index = 1;
        
        while(T-->0) {
            //상품 수 N 입력
            int N = Integer.parseInt(br.readLine());
            
            //가격 배열
            int[] P = new int[2*N];
            
            //해시맵 선언
            HashMap<Integer, Integer> map = new HashMap<>();
            
            st = new StringTokenizer(br.readLine());
            for(int i=0 ; i<2*N ; i++) {
                //가격 입력
                P[i] = Integer.parseInt(st.nextToken());
                
                map.put(P[i], map.getOrDefault(P[i], 0)+1);
            }
            
            List<Integer> answer = new ArrayList<>();
            
            for(int i=2*N-1 ; i>=1 ; i--) {
                int cur = P[i];
                
                if(map.get(cur) == 0) {
                    continue;
                }
                
                map.put(cur, map.get(cur)-1);
                
                //할인가
                int sale = cur-cur/4;
                
                answer.add(sale);
                
                map.put(sale, map.get(sale)-1);
            }
            
            sb.append(String.format("Case #%d: ", index++));
            
            for(int i=N-1 ; i>=0 ; i--) {
                sb.append(answer.get(i)).append(' ');
            }
            sb.append('\n');
        }
        
        System.out.print(sb.toString());
    }
}