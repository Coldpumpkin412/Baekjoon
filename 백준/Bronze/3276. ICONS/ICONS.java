import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int N = Integer.parseInt(br.readLine());

        int row = 1;
        int col = 1;
        
        while(row*col < N) {
            if(row == col) {
                ++row;
            }else {
                ++col;
            }
        }

        System.out.println(row + " " + col);
    }
}