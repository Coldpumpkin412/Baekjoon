import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //줄의 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        for(int i=1 ; i<=N ; i++){
            String str = br.readLine();
            
            sb.append(i).append(". ").append(str).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}