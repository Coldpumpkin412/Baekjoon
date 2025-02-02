import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[1001];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            num[Integer.parseInt(st.nextToken())]++;
        }
        
        int tmp = 0;
        int answer = 0;
        
        for(int i=1 ; i<1001 ; i++){
            if(num[i] != 0){
                tmp = i;
                answer++;
                num[i]--;
            }
        }
        tmp++;
        
        for(int i=1000 ; i>=1 ; i--){
            if(i<tmp && num[i]>=1){
                tmp = i;
                answer++;
            }
        }
        
        System.out.print(answer);
    }
}