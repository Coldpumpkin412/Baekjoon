import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger C = A.subtract(B).divide(BigInteger.valueOf(2));

        System.out.println(C.add(B)+ " "+ C);

    }
}