import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //B1, B2 BigInteger로 입력 
        BigInteger B1 = sc.nextBigInteger(2);
        BigInteger B2 = sc.nextBigInteger(2);
        
        //곱셈
        BigInteger mul = B1.multiply(B2);
        
        //2진수로 변경
        String answer = mul.toString(2);
        
        System.out.println(answer);
    }
}