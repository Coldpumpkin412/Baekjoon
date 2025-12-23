import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int S = sc.nextInt();
        int M = sc.nextInt();
        int L = sc.nextInt();

        int answer = 2*M + 3*L + S;
        System.out.println(answer > 9 ? "happy" : "sad");
    }
}