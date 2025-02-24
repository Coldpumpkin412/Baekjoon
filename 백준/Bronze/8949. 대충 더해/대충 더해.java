import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;       
        StringBuilder sb = new StringBuilder();
        
        //A, B 입력
        st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        
        int len = Math.abs(A.length() - B.length());
        
        if(A.length() < B.length()){
            A = "0".repeat(len) + A;
        }else{
            B = "0".repeat(len) + B;
        }
                    
        for(int i=0 ; i<A.length() ; i++) {
            sb.append(A.charAt(i)-'0' + B.charAt(i)-'0');
        }
        System.out.println(sb.toString());
    }
}