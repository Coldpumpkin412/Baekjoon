import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //정수 N 입력
        int N = Integer.parseInt(br.readLine());

        // 비트 반전 후 1 더하기
        int outputNum = ~N + 1;

        // XOR 연산
        int sameBitNum = N ^ outputNum;

        // 서로 다른 비트 수 카운트
        int count = 0;
        
        for(char ch : Integer.toBinaryString(sameBitNum).toCharArray()){
            if(ch == '1'){
                count++;
            }
        }

        System.out.print(count);
    }
}