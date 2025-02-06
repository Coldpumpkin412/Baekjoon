import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int index = 0;
        
        while(true) {
            if(N == (1 + index + index * index)) {
                break;
            }
            index++;
            
            if(index > 10101) {
                break;
            }
        }
        System.out.println(index);
    }
}