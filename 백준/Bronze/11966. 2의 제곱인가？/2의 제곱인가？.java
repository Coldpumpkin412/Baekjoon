import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0 ; i<31 ; i++){
            if(Math.pow(2,i) == N){
                System.out.println("1");
                return;
            }
        }

        System.out.println(0);
    }
}