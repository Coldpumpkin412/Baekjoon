import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");

        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        int idx = Integer.parseInt(input[2]);

        System.out.print(idx/col + " " + idx%col);
    }
}