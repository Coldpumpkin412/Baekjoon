import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        while(N-->0){
            st = new StringTokenizer(br.readLine());
            double D = Double.parseDouble(st.nextToken());
            double F = Double.parseDouble(st.nextToken());
            double P = Double.parseDouble(st.nextToken());

            String str = String.format("%.2f", D*F*P);
            System.out.println("$" + str);            
        }

    }
}