import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //테스트 케이스 개수 T 입력
		int T = sc.nextInt();
        
		while(T-->0) {
            
            //N,M 입력 및 배열 선언
			int N = sc.nextInt();
            int M = sc.nextInt();
            
			long team[] = new long[N+1];
            long win[] = new long[N+1];
            long lose[] = new long[N+1];
            
			long max = 0;
            long min = 0;
            
			for(int i=1 ; i<=M ; i++){
				int a = sc.nextInt();
                int b = sc.nextInt();
                int p = sc.nextInt();
                int q = sc.nextInt();
                
				win[a] += p; 
                win[b] += q; 
                lose[a] += q; 
                lose[b] += p;
			}
			for(int i=1 ; i<=N ; i++){
				if(win[i]==0 && lose[i]==0){
                  team[i]=0;  
                } else{
                  team[i] = (win[i]*win[i])*1000 / (win[i]*win[i] + lose[i]*lose[i]);  
                } 
				if(i == 1){
					min = max = team[i];
					continue;
				}
				if(max < team[i]){
                  max = team[i];  
                } 
				if(team[i] < min){
                  min = team[i];  
                } 
			}
            
			System.out.println(max+"\n"+min);
		}
	}
}