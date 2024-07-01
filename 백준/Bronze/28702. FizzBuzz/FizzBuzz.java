import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=3 ; i>0 ; i--){
            String str = br.readLine();
            
            if(str.matches("-?\\d+(\\.\\d+)?")) {
                int N = Integer.parseInt(str) + i;
                
                if(N%3 == 0){
                    if(N%5 == 0) {
                        System.out.println("FizzBuzz");
                    }else {
                        System.out.println("Fizz");
                    }
                }else if(N%5 == 0) {
                    System.out.println("Buzz");
                }else {
                    System.out.println(N);
                }
                return;
            }
        }
    }
}