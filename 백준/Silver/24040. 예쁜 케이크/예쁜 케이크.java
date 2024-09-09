import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            //N 입력
            long N = Long.parseLong(br.readLine());
            
            if(N%9==0 || N%3==2) {
                System.out.println("TAK");
            }else {
                System.out.println("NIE");
            }
        }
    }
}