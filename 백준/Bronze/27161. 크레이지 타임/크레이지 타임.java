import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        int cur = 0;
        boolean check = false;
        
        while(N-->0) {
            st = new StringTokenizer(br.readLine());
            boolean isHourGlass = st.nextToken().charAt(0) == 'H';
            int num = Integer.parseInt(st.nextToken());
            
            cur += (check ? -1 : 1);
            
            if(cur <= 0) {
                cur = 12;
            }
            if(cur==13) {
                cur = 1;
            }
            
            boolean clap = false;
            
            if(isHourGlass && cur!=num) {
                check = !check;
            }
            if(cur==num && !isHourGlass){
                clap = true;
            }
                
            sb.append(cur).append(' ').append(clap?"YES":"NO").append('\n');
        }
        System.out.print(sb.toString());
    }
}