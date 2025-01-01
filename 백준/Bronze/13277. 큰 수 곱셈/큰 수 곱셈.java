import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        
        BigInteger l = new BigInteger(A);
        BigInteger r = new BigInteger(B);

        // 출력
        System.out.print(l.multiply(r));
    }
}