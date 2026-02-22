import java.util.*;
import java.io.*;

public class Main {   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        
        System.out.println(H+W - Math.sqrt(H*H + W*W));
    }
}
