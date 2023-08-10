import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //묘목의 수 N 입력 및 묘목배열 선언
        int N = sc.nextInt();
        
        //묘목이 자라는데 걸리는 시간들 입력
        Integer[] t = new Integer[N];
        for (int i=0 ; i<N ; i++) {
            t[i] = sc.nextInt();
        }
        
        //내림차순정렬(오래걸리는 것 부터 심기)
        Arrays.sort(t, Collections.reverseOrder());
        
        int answer = 0;
        for (int i=0 ; i<N ; i++) {
            //묘목 자라는데 걸리는 시간+지난 날짜+심는데 걸리는시간 1일과 비교
           answer = Math.max(answer, t[i]+i+1);
        }
        
        //다 심은 후 하루 뒤 날짜 출력
        answer++;
        
        System.out.println(answer);
    }
}