import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();

        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.print(A.multiply(B));

    }
}