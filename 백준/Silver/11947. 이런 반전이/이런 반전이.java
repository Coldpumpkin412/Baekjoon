import java.util.*;
import java.io.*;

public class Main {
    //반전시키는 함수
    public static Long Reverse(long k) {
        String num = String.valueOf(k);
        String temp = "";
        
        //아스키코드 활용
        for(int i=0 ; i<num.length() ; i++) {
            temp += 9-(num.charAt(i)-'0');
        }
            
        //형변환 후 리턴
        return Long.parseLong(temp);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //테스트케이스 개수 T입력
        int T = sc.nextInt();
        
        while(T-->0) {
            int K = sc.nextInt();
            
            for(long i=10 ; ; i*=10) {
                if(K < i) {
                    if(K < i/2) {
                        System.out.println(K * Reverse(K));
                    } else{
                        System.out.println(i/2 * Reverse(i/2));
                    } 
                    break;
                }
            }
        }
    }
}