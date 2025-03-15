import java.util.*;
import java.io.*;

public class Main {

    static String str;    
    
    static boolean compare(int N) {
        boolean check = false;
        
        for(int i=0 ; i<N ; i++) {
            if(str.charAt(i) == str.charAt(str.length()-N+i)) {
                continue;
            }
            
            if(check) {
                return false;
            }else {
                check = true;
            }
        }

        return check;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자열 길이 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //문자열 입력
        str = br.readLine();
        while(--N > 0) {
            if(compare(N)) {
                break;
            }
        }

        System.out.println((N>0) ? "YES" : "NO");
        
    }
}