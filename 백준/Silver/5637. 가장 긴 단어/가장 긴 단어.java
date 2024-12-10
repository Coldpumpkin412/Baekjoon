import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max = -1;
        
        String maxStr = null;
        
        while (true) {
            //입력값 소문자 변경 후 정규식 활용하여 분리
            String[] split = br.readLine().toLowerCase().split("[^a-z-]");
            
            for(String now : split) {
                if(now.equals("e-n-d")) {
                    System.out.println(maxStr.toLowerCase());
                    
                    return;
                }
                if(max < now.length()) {
                    max = now.length();
                    maxStr = now;
                }
            }
        }
        
    }
}