import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        double S1 = Double.parseDouble(st.nextToken());
        double S2 = Double.parseDouble(st.nextToken());

        if(S1 >= S2/2) {
            System.out.println("E");
        } else {
            System.out.println("H");
        }
    }
}