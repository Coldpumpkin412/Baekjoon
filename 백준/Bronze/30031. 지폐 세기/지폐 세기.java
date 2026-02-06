import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        while(N-->0){
            st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken());

            if(W == 136){
                sum += 1000;
            }else if(W == 142) {
                sum += 5000;
            }else if(W == 148) {
                sum += 10000;
            }else if(W == 154)   {
                sum += 50000;
            }
        }
        
        System.out.println(sum);
    }
}