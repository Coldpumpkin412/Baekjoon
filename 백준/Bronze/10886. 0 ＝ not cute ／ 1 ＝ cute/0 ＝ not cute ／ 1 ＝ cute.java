import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int N = Integer.parseInt(br.readLine());
      
        int cute_count = 0;
        int not_count = 0;
        while(N-->0) {
            int num = Integer.parseInt(br.readLine());
        
            if(num == 1) {
                cute_count++;
            }else {
                not_count++;
            }
        }
        
        System.out.print((cute_count > not_count) ? "Junhee is cute!" : "Junhee is not cute!");
    }
}