import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String input = "";
        
        while((input = br.readLine()) != null) {
            st = new StringTokenizer(input);

            int r = Integer.parseInt(st.nextToken());
            double s = Double.parseDouble("0" + st.nextToken());

            double answer = Math.sqrt((r * (s + 0.16)) / 0.067);

            System.out.println(Math.round(answer));
        }
    }
}