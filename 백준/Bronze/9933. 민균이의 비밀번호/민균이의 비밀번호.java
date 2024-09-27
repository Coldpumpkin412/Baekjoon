import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //단어 수 N 입력
        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        while(N-->0) {
            String str = br.readLine(); 

            set.add(str);

            StringBuilder sb = new StringBuilder(str);
            String reverse = sb.reverse().toString(); 

            if (set.contains(reverse)) { 
                System.out.println(reverse.length() + " " + reverse.charAt(reverse.length()/2));
                
                break; 
            }
        }
    }
}