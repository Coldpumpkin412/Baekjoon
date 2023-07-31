import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //N입력
        int N = sc.nextInt();
        
        //교차점의 개수를 구하는 점화식 활용하여 값 출력
        System.out.println((N*(N-1)*(N-2)*(N-3))/24);
    }
}