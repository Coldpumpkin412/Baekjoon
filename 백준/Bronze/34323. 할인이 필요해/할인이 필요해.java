import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt(); 
        int S = sc.nextInt(); 

        long discountPrice = (long)(M+1) * S * (100-N) / 100;

        long eventPrice = (long)M * S;

        // 더 작은 값 출력
        System.out.println(Math.min(discountPrice, eventPrice));
    }
}