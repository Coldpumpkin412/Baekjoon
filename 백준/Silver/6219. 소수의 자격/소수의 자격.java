import java.util.*;
import java.io.*;

public class Main {
    //소수 판별 isPrime 함수
    public static boolean isPrime(int number) {
        if(number == 1) {
            return false;
        }
        //제곱근의 범위까지
        for(int i=2 ; i*i<=number ; i++) {
            if(number%i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //세 정수 A, B, D 입력
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int answer = 0;
        
        for(int i=A ; i<=B ; i++) {
            //소수판별 함수
            if(isPrime(i)) {
                int tmp = i;

                while(tmp != 0) {
                    if(tmp%10 == D) {
                        answer++;
                        break;
                    }
                    
                    tmp /= 10;
                }
                
            }
        }
        
        System.out.println(answer);
    }
}