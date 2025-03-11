import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            int[] score = new int[5];
            
            st = new StringTokenizer(br.readLine());
            for(int i=0 ; i<score.length ; i++) {
                score[i] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(score);

            if(score[3]-score[1] >= 4) {
                System.out.println("KIN");
            }else {
                int sum = score[1] + score[2] + score[3];
                
                System.out.println(sum);
            }
        }
        
    }
}