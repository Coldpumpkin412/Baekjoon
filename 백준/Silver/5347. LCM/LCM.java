import java.util.*;
import java.io.*;

public class Main {
    
    //유클리드 호제법을 활용하여 최대공약수 구하기
    public static long gcd(int x, int y) {
        if (x%y == 0){
            return y;
        }
            
        return gcd(y, x%y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //테스트케이스 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        

        while (N-->0) {
            st = new StringTokenizer(br.readLine());
            
            //숫자 입력
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            //최소공배수
            System.out.println((long) a*b / gcd(a, b));
        }
    }
}