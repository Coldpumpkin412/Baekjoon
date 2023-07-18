import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //사람 수 N 입력 및 키 배열 선언
        int N = sc.nextInt();
        int[] tall = new int[N+1];
    
        List<Integer> list = new ArrayList<>();
 
        //배열 값 입력
        for(int i=1 ; i<=N ; i++) {
            tall[i] = sc.nextInt();
        }
         
        //뒤에서부터 리스트에 입력
        for(int i=N ; i>=1 ; i--) {
            list.add(tall[i], i);
        }
         
        //정답 출력
        for(int val : list) {
            System.out.print(val + " ");
        }
    }
}
