import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double N = Integer.parseInt(br.readLine());

        System.out.printf("%.10f\n%.10f", 100/N, 100/(100-N));
    }
}