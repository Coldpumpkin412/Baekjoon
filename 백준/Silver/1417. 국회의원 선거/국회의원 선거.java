import java.util.*;

public class Main {

    public static void main(String[] args) {
        //우선순위 큐 활용하여 풀기
        Scanner sc = new Scanner(System.in);
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        
        //후보 수 N 입력
        int N = sc.nextInt();
        
        //맨처음 들어온 다솜의 득표 수 입력
        int temp = sc.nextInt();
        
        //남은 의원들의 득표 수 입력
        for (int i=1 ; i<N ; i++) {
            queue.add(sc.nextInt());
        }
        
        int answer = 0;
        
        //큐가 빌때까지
        while (!queue.isEmpty()){
            //큐의 헤드값 뺀 후 저장
            int num = queue.poll();
            
            //다솜의 득표 수 보다 큰 경우
            if(temp<=num ){
                //횟수 증가 및 다솜의 득표수 증가
                answer++;
                temp++;
                
                //큐에 줄어든 득표수를 다시 넣어주기
                queue.add(--num);
            }
        }

        System.out.println(answer);
    }
}