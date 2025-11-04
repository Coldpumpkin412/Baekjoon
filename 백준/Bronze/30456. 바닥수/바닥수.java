import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        if(N == 0){
            System.out.print("10");
        }else{
            System.out.print("1" + (N/1));
        }
        
        L -= 2;
        
        System.out.print("1".repeat(L));
    }
}