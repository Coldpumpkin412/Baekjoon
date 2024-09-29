import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //테스트케이스 개수 N 입력
        int N = sc.nextInt();
        
        while(N-->0) {
            //고려할 선수 수 P 입력
            int P = sc.nextInt();
            int max = 0;
            
            HashMap<Integer, String> map = new HashMap<>();
            
            while(P-->0) {
                //가격, 이름 입력
                int cost = sc.nextInt();
                String name = sc.next();
                
                map.put(cost, name);
                
                max = Math.max(max, cost);
            }
            
            System.out.println(map.get(max));
        }
                
    }
}