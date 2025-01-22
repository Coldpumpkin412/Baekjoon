import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int W = sc.nextInt();
 
        int sheep = 1;
        int count = 0;
        int S = 0;
        int G =0 ;
        
        for(sheep=1 ; sheep<N ; sheep++) {
            if(A*sheep + B*(N-sheep) == W) {
                count++;
                
                S = sheep;
                G = N-sheep;
            }
        }
        
        if(count == 1) {
            System.out.println(S +" "+ G);
        }else {
            System.out.println("-1");
        }
    }
}
 
