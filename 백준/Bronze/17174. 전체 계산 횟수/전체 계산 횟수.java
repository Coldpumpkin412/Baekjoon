import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int count = 0;

        while (N > 0) {
            count += N;   // 이번 단계에서 세는 횟수
            N /= M;       // 다음 묶음 개수
        }

        System.out.println(count);
    }
}