import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        double area = (A * B) / 4840.0;
        
        System.out.println((int)Math.ceil(area / 5));
    }
}