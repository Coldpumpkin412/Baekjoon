import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N%5 > 0) {
            System.out.println((N/5 + 1));
        }else {
            System.out.println(N/5);
        }

    }
}