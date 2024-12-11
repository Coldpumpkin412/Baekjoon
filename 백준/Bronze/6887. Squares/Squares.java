import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //타일 개수
        int N = Integer.parseInt(br.readLine());

        System.out.printf("The largest square has side length %d.", (int)Math.sqrt(N));
    }
}