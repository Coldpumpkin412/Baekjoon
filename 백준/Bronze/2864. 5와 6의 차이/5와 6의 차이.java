import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String a_str = String.valueOf(a);
        String b_str = String.valueOf(b);

        int min = Integer.parseInt(a_str.replace("6", "5")) + Integer.parseInt(b_str.replace("6", "5"));
        int max = Integer.parseInt(a_str.replace("5", "6")) + Integer.parseInt(b_str.replace("5", "6"));
        System.out.println(min + " " + max);
    }
}