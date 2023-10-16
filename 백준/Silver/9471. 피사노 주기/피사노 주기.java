import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 P 입력
        int P = Integer.parseInt(br.readLine());
        
        for(int i=0 ; i<P ; i++) {
            //입력값을 문자열로 받아서 공백기준 분할하기
            String[] str = br.readLine().split(" ");
            
            //구하고자하는 M 입력
            int M = Integer.parseInt(str[1]);
            
            int a = 1;
            int b = 1;
            
            int count = 0;
            
            while(true) {
                int next = (a + b) % M;
                
                a = b;
                b = next;
                
                count ++;
                
                //피보나치 수열이 다시 시작되려면 1,1이 연속으로 나와야한다
                if (a==1 && b==1) {
                    break;
                }
            }
            
            sb.append(i+1).append(" ").append(count).append("\n");
        }
    
        System.out.println(sb);
    }
}