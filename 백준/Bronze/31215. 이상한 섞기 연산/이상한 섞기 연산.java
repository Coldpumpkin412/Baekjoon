import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0){
            //N 입력
            int N = Integer.parseInt(br.readLine());
            
            //N이 3이상인경우
            if(N >= 3){
                sb.append(3).append("\n");
            }else{
                sb.append(1).append("\n");
            }
        }
        
        System.out.println(sb.toString());
    }
}