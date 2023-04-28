import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
         
        //다이나믹 프로그래밍에 활용할 배열 선언
        BigInteger[] DP = new BigInteger[250 + 1];
         
        //초기값 입력
        DP[0] = new BigInteger("1"); 
        DP[1] = new BigInteger("1");
        DP[2] = new BigInteger("3");
        
        for(int i=3; i<=250; i++) {
            // 점화식 : DP[i] = (DP[i-1] + DP[i-2] * 2)
            DP[i] = DP[i-2].multiply(new BigInteger("2"));
            DP[i] = DP[i].add(DP[i-1]);
        }
        
        while(sc.hasNextInt()){
           int n = Integer.parseInt(sc.next());
           System.out.println(DP[n]);
        }
    }
}