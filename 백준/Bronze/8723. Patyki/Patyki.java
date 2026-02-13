import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A*A==(B*B)+(C*C) || B*B==(A*A)+(C*C) || C*C==(A*A)+(B*B)){
            System.out.println(1);
        }else if(A==B && B==C){
            System.out.println(2);
        }else{
            System.out.println(0);
        }
        
    }
}