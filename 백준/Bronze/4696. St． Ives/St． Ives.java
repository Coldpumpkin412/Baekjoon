import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            double N = Double.parseDouble(br.readLine());
            if(N == 0){
                break;
            }
                

            System.out.printf("%.2f\n", 1 + N + N*N + N*N*N + N*N*N*N);
        }

    }
}