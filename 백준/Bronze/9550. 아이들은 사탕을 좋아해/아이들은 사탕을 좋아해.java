import java.util.*; 
import java.io.*;

public class Main {	
    public static void main(String[] args) {		
        Scanner sc  = new Scanner(System.in);	
        
        int T = sc.nextInt();		
        
        while(T-->0) {			
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            int count = 0;		
            
            for(int i=0 ; i<N ; i++) {
                count += sc.nextInt()/K;
            }				
            
            System.out.println(count);		
        }	
    }	
}
