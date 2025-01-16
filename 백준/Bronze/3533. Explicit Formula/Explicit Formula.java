import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] num = new int[10];
    
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 10; ++i) {
            num[i] = Integer.parseInt(st.nextToken());
        }
            

        int answer = 0;
    
        for(int i=0 ; i<9 ; ++i) {
            for (int j=i+1 ; j<10; ++j) {
                answer ^= (num[i] | num[j]);
            }                
        }
    
        for(int i=0 ; i<8 ; ++i) {
            for(int j=i+1 ; j<9; ++j) {
                for(int k = j + 1; k < 10; ++k) {
                    answer ^= (num[i] | num[j] | num[k]);
                }                    
            }
        }

        System.out.println(answer);
    }
}