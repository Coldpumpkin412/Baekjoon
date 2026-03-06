import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long P = scanner.nextLong();

        long num = 1;

        for(int i=2 ; i<N+1 ;i++){
            num = (num*i) % P;
        }

        System.out.println(num%P);
    }
}