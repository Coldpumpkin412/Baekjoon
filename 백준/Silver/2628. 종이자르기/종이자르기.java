import java.util.*;
import java.io.*;
 
public class Main { 
    public static void main(String[] args) throws IOException {	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine()); 
        int M = Integer.parseInt(st.nextToken()); // 열	
        int N = Integer.parseInt(st.nextToken()); // 행 
        
        int[] cutM = new int[M + 1];		
        int[] cutN = new int[N + 1]; 		
        
        st = new StringTokenizer(br.readLine());		
        int C = Integer.parseInt(st.nextToken()); // 점선 개수	
        
        for(int i=0 ; i<C ; i++) {			
            st = new StringTokenizer(br.readLine());			
            int mode = Integer.parseInt(st.nextToken());		
            int num = Integer.parseInt(st.nextToken());		
            
            if(mode == 0) { 
                // 가로로			
                cutN[num] = 1; // 행 배열		
            }else {
                cutM[num] = 1;		
            }	
                
        }		
        
        int tmp = 0;		
        int maxN = 0;	
        
        for(int i=1 ; i<=N ; i++) {
            tmp++;			
            
            if(cutN[i] == 1 || i == N) {		
                maxN = Math.max(maxN, tmp);		
                tmp = 0;			
            }		
        }		
        tmp = 0;		
        
        int maxM = 0;	
        
        for(int i=1 ; i<=M ; i++) {	
            tmp++;		
            
            if(cutM[i]==1 || i==M) {
                maxM = Math.max(maxM, tmp);
                tmp = 0;		
            }		
        }		
        
        System.out.println(maxM * maxN);	
    } 
}
