import java.util.*; 
import java.io.*;

public class Main {	
    public static void main(String[] args) throws Exception{		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
        StringTokenizer st;
        
        //날짜 및 챕터 수 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken());
        
        int[] days = new int[M]; 
        int[] pages = new int[M]; 
        
        //다이나믹프로그래밍 배열 선언
        int[] dp = new int[N+1];		
        
        for(int i=0 ; i<M ; i++) {			
            st = new StringTokenizer(br.readLine());			
            days[i]=Integer.parseInt(st.nextToken());			
            pages[i]=Integer.parseInt(st.nextToken());		
        }		
        	
        for(int i=0 ; i<M ; i++) {			
            for(int j=N ; j>=days[i] ; j--) {				
                dp[j] = Math.max(dp[j], dp[j-days[i]]+pages[i]);	
            }		
        }		
        
        System.out.println(dp[N]);	
    }
}