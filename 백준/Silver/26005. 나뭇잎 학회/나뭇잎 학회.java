import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력
        int N = Integer.parseInt(br.readLine());
        
        int answer = 0;
        
        if(N >= 2) {
            answer = N*N / 2;
            
            if(N%2 == 1) {
                answer++;
            }
        } 
    	
    	System.out.println(answer);
    }
}