import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigDecimal A = new BigDecimal(br.readLine());

        double answer = A.multiply(BigDecimal.valueOf(Math.PI))
                         .multiply(BigDecimal.valueOf(4))
                         .sqrt(new MathContext(12)).doubleValue();

        System.out.println(answer);
    }
}