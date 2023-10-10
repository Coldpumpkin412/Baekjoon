import java.util.Scanner;

public class Main{
    //조합 함수
    static long Combination(int N, int R){
        int p = 1;
        int c = 1;

        while(R > 0){
            c *= N--;
            p *= R--;
        }
        
        return c/p;
    }
    
    public static void main(String[] args){
        //순열조합 문제
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        double res = 0.0;
        double p = Combination(N, M);

        while(M >= K){
            if(N-M < M-K){
                K++;
                continue;
            }

            double c = Combination(M, K) * Combination(N-M, M-K);

            res += c/p;
            K++;
        }

        System.out.println(res);
    }

    
}