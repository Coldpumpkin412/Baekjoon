import java.util.*;
import java.io.*;

interface Main{
    static void main(String[]a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = "";
        
        //정규식
        String regex = "(?i).*nemo.*";
        
        while(!(str = br.readLine()).equals("EOI")){
            if(str.matches(regex)) {
                System.out.println("Found");
            } else {
                System.out.println("Missing");
            }
        }
      
    }
}