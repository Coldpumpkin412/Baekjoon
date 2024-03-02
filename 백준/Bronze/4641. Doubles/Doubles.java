import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //무한루프
        while(true){
            int count = 0;
            int i = 0;
            int[] num = new int[16];
            
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int token = Integer.parseInt(st.nextToken());
                
                if(token == -1){
                    return;    
                } 
                
                num[i] = token;
                i++;
            }
            
            //오름차순 정렬
            Arrays.sort(num);
            
            for(int j=0 ; j<16 ; j++){
                for(int k=j ; k<16 ; k++){
                    if(num[j]==0 || num[k]==0){
                        continue;    
                    } 
                    if(num[k] == num[j]*2){
                        count++;    
                    }                        
                }
            }
            
            System.out.println(count);
        }
    }
}
 
