import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] input = new int[7];
        
        for (int i=0 ; i<7 ; i++) {
            input[i] = sc.nextInt();
        }
        
        Arrays.sort(input);
        
        int a = input[0];
        int b = input[1];
        int max = input[6];
        
        int c = max-a-b; 

        System.out.print(a + " " + b + " " + c);
  }
}