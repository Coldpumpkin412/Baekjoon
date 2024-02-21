import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //N 입력
        long N = sc.nextLong();
        
        long answer = 0;
        
        while(N>9){
            long length = Long.toString(N).length();
            
            answer += (N-Math.pow(10, length-1)+1) * length;
            
            N = (long)Math.pow(10, length-1) - 1;
        }
        
        answer += N;
        
        System.out.println(answer % 1234567);
    }
}
    