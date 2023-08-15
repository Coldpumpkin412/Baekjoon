import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //피제수A, 제수B, 자릿수N입력
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();

        int result = A%B; // 정수 영역의 나머지 구함

        for(int i=0 ; i<N-1 ; i++){ // 그 나머지의 10을 곱해 다음 자리 나머지를 구함
            result *= 10;
            result %= B;
        }

        result *= 10;

        System.out.println(result/B); 
    }

}
