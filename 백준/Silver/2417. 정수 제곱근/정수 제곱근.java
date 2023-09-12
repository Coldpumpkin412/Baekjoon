import java.util.*;
import java.math.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //정수 N 입력
        long N = Long.parseLong(br.readLine());
        
        //sqrt 활용하여 제곱근 구하기
        long sqrtN = (long)Math.sqrt(N);
        
        //제곱수가 아닌경우 값을 1 더해준다(삼항연산자 활용)
        System.out.println((sqrtN*sqrtN < N) ? sqrtN+1 : sqrtN);
    }
}