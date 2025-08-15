import java.util.*;
import java.io.*;
 
class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] num = br.readLine().split(" ");
        
        int answer = 5000;
        int[] DRINK = {500, 800, 1000};
        
        
        for(int i=0, j=num.length ; i<j ; i++) {
            int button = Integer.parseInt(num[i]);
            
            answer -= DRINK[button-1];
        }
        
        System.out.println(answer);
    }
}