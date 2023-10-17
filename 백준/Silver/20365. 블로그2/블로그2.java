import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //N 입력
        int N = Integer.parseInt(br.readLine());
        
        //문자 입력
        String str = br.readLine();
        
        int bCnt = 0;
        int rCnt = 0;
        char ch = '\0';
        
        for (int i=0 ; i<N ; i++) {
            char cur = str.charAt(i);
            
            if (cur != ch) {
                if (cur=='R') {
                    rCnt++;
                } else {
                    bCnt++;
                }
            }
            ch = cur;
        }
        
        System.out.println(Math.min(rCnt, bCnt) + 1);
    }
}