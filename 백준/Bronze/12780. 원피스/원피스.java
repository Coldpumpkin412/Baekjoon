import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String A = br.readLine();
        String B = br.readLine();
        
        int index = -1;
        
        int count = 0;
        
        while(index!=0 && index<=A.length()) {
            index = A.indexOf(B, index);
            
            if(index != -1){
                count++;
            }
                
            index++;
        }
        
        System.out.println(count);
    }
}