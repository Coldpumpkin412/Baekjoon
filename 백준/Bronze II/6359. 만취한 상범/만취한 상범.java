import java.util.*;
import java.io.*;

public class Main {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        //테스트케이스 개수
		int T = sc.nextInt();
        
		while(T-->0) {
			int N = sc.nextInt();
			int[] d = new int[N+1];//0잠김 1열림
            
			for(int i=1 ; i<=N ; i++) {
				for(int j=1 ; i*j<=N ; j++) {
					if(d[i*j]!=0){
                        d[i*j]=0;
                    }else{
                        d[i*j]=1;
                    }  
				}
			}
			int answer=0;
            
			for(int i=1 ; i<=N ; i++) {
				answer += d[i];
			}
            
			System.out.println(answer);
		}
	}

}