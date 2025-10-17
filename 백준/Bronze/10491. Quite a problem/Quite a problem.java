import java.util.*;
import java.io.*;

interface Main{
    static void main(String[]a) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = "";
        String regex = "(?i).*problem.*";
        
        while((str = br.readLine()) != null){
          if(str.matches(regex)) {
              System.out.println("yes");
          }else {
              System.out.println("no");
          }
      }
        
    }
}