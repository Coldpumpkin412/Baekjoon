import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-->0){

            String ch = sc.next();

            char[] N = ch.toCharArray();

            int A = N.length/2;

            if(N[A-1] == N[A]){
                System.out.println("Do-it");
            }else{
                System.out.println("Do-it-Not");
            }
        }
    }
}