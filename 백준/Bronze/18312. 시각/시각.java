import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
         
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
                                 
        int answer = 0;

        String time = Integer.toString(K);

        for(int i=0 ; i<=N ; i++) {
            for(int j=0; j<=59 ; j++) {
                for(int l=0 ; l<=59 ; l++) {
                    
                    String str = String.format("%02d%02d%02d", i, j, l);

                    if(str.contains(time)){
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}