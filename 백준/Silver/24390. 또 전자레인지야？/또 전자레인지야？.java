import java.util.*;
import java.io.*;

public class Main  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //조리시간 분 M, 초 S 입력 후 : 기준 분리
       String[] str = br.readLine().split(":");
       int M = Integer.parseInt(str[0]);
       int S = Integer.parseInt(str[1]);
        
       int count = 1;
        
       count += (M/10 + M%10);
        
       if(S < 30) {
           count += S/10;
       }
        
       if(S >= 30) {
           count += (S - 30)/10;
       }
        
       System.out.println(count);
    }
}