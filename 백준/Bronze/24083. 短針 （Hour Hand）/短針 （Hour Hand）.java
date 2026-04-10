import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int H = (A+B) % 12;
        
        if(H%12 == 0) {
            System.out.println(12);
        }else {
            System.out.println(H);
        }
    }
}