import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int R = sc.nextInt();
        int C = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i=0 ; i<R ; i++) {
            for(int a=0 ; a<A ; a++) {
                for(int j=0 ; j<C ; j++) {
                    for(int b=0 ; b<B ; b++) {
                        if((i+j)%2 == 0) {
                            System.out.print("X");
                        }else {
                            System.out.print(".");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}