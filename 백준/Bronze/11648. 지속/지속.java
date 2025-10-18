import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        int count = 0;

        while(T >= 10) {
            int index = 1;

            while(T > 0) {
                index *= T%10;
                T /= 10;
            }
            T = index;
            count++;
        }
        System.out.println(count);
    }
}