import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String[] club = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
        
        int N = Integer.parseInt(br.readLine());
        
        int max = 0;
        int group = 0;
        
        for(int i=0 ; i<9 ; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0 ; j<N ; j++) {
                int num = Integer.parseInt(st.nextToken());
                
                if(max < num) {
                    max = num;
                    group = i;
                }
            }
        }
        System.out.println(club[group]);
    }
}