import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());        
        int A = Integer.parseInt(st.nextToken()) * 7;
        int P = Integer.parseInt(st.nextToken()) * 13;

        String answer = "";
        
        if(P > A){
            answer = "Petra";
        }else if(P == A){
            answer = "lika";
        }else {
            answer = "Axel";
        }

        System.out.print(answer);
    }
}