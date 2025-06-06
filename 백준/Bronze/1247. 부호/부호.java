import java.util.*;
import java.io.*;
import java.math.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0 ; i<3 ; i++) {
            BigInteger answer = new BigInteger("0");
            
            int N = Integer.parseInt(br.readLine());

            for(int j=0 ; j<N ; j++) {
                BigInteger N2 = new BigInteger(br.readLine());
                answer = answer.add(N2);
            }

            if(answer.compareTo(BigInteger.ZERO) == -1){
                System.out.println("-");
            }else if(answer.compareTo(BigInteger.ZERO) == 1){
                System.out.println("+");
            }else{
                System.out.println(0);
            }

        }
    }
}