import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //A, B, C 입력
        int A = sc.nextInt();
        int B = sc.nextInt();
        String C_str = sc.next(); 

        BigInteger C_big = new BigInteger(C_str);
        
        int C = C_big.mod(BigInteger.TWO).intValue();

        System.out.println((C==0) ? A : (A ^ B));
    }
}