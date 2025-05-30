import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
       
        int index = 0;
        
        for(int i=0 ; i<N ; i++){
            int tmp = Integer.parseInt(br.readLine());
            
            if(tmp == 1){
                index++;
                
                if(index > S){
                    S *= 2;
                }
            }else{
                index--;
            }
        }
        
        System.out.println(S);
    }
}