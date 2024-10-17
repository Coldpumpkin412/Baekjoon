import java.util.*;
import java.io.*;

public class Main {

    static int Read() throws IOException {
        int C; 
        int N = System.in.read() & 15;
        
        while((C = System.in.read()) > 32) {
            N = (N<<3) + (N<<1) + (C&15);
        }

        return N;
    }
    
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        
        //전화기 대수 N 입력
        int N = Read();
        int count = 0;
        
        for(int i=1 ; i<=N ; i++) {
            //전화기 번호
            int a = Read();
            
            if(a == i) {
                a = (a==N) ? 1 : N;
                count++;
            }
            
            sb.append(a).append(" ");
        }

        System.out.println(count + "\n" + sb.toString());
    }

}