import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N을 문자열로 입력 받은 후 BigInteger로 변형
        String str = br.readLine();
        BigInteger N = new BigInteger(str);
        
        //N이 1, 2일때를 제외하고 N+(N-2)가 성립됨
        if(N.compareTo(new BigInteger("1")) == 0){
            System.out.println(1);
        }else if(N.compareTo(new BigInteger("2")) == 0) {
            System.out.println(2);
        }else{
            System.out.println(N.add(N).subtract(new BigInteger("2")));
        }
    }
}