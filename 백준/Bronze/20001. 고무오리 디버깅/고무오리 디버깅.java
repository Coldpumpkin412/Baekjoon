import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        br.readLine();
        
        int count = 0;
        
        while(true) {
            String s = br.readLine();
            
            if(s.equals("고무오리 디버깅 끝")) {
                break;
            }
            if(s.charAt(0) == '문') {
                count++;
            }else {
                count--;
            }
            if(count < 0) {
                count=2;
            }
        }
        System.out.println(count==0 ? "고무오리야 사랑해" : "힝구");
    }
}