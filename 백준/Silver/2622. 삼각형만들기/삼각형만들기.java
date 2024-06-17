import java.util.*;
import java.io.*;

public class Main {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //성냥개비 개수 입력
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        
        for(int i=1 ; N-i>0 ; i++) {
            for (int j=i ; j<=N-i-j ; j++) {
                int index = N-i-j;
                
                if(i+j > index) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}