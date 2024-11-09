import java.util.*;
import java.io.*;
 
public class Main {	
    public static void main(String[] args) throws Exception{		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());	
        
        while(T-->0) {			
            int N = Integer.parseInt(br.readLine());
            int answer = 0;			
            
            for(int i=0 ; i<N ; i++) {				
                st= new StringTokenizer(br.readLine());				
                int A = Integer.parseInt(st.nextToken()); 
                int B = Integer.parseInt(st.nextToken());		
                
                double r = Math.sqrt(A*A + B*B);
                
                for(int j=1 ; j<=10 ; j++) {					
                    if(r <= 20*j) {						
                        answer += 11-j;						
                        break;					
                    }				
                }			
            }		
            
            System.out.println(answer);		
        }
        
    }
}
