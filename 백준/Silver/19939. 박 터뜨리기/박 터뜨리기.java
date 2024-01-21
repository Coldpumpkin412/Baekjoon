import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
               
        int[] baskets = new int[K];
        
        int base = (N-((K*(K+1))/2));
        
        if(base<0) {
            System.out.println("-1");
            return;
        }
        
        
        for(int i=0 ; i<baskets.length ; i++) {
            baskets[i] = (base / K);
            N -= (base / K);
        }
        
        if (N == ((K*(K+1))/2)) {
            System.out.println(K-1);
        }else{
            System.out.println(K);
        }
    }
}