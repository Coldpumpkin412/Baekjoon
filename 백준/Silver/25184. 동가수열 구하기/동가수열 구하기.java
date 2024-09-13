import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //동가수열 길이 N 입력
        int N = Integer.parseInt(br.readLine());
 
        int left = N/2;
        int right = (N%2==1) ? N-1 : N;
 
        for(int i=0 ; i<N/2 ; i++) {
            sb.append(left--).append(' ').append(right--).append(' ');
        }
 
        if(N%2 == 1) {
            sb.append(N).append('\n');
        }else {
            sb.append('\n');
        }
 
        System.out.println(sb.toString());
    }
}