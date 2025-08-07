import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int R = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());
        
        System.out.println(8*R + 3*S - 28);
    }
}