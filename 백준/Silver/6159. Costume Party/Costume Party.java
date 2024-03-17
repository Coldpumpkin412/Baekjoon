import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        
        boolean[] chk;
        //소의 수 N, 코스튬 크기 S 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] size = new int[N];
        
        for(int i=0 ; i<N ; i++){
            size[i] = Integer.parseInt(br.readLine());
        }
        
        int answer = 0;
        	
                
        for(int i=0 ; i<N ; i++) {
        	for(int j=0 ; j<N ; j++) {
        		if(i!=j && size[i]+size[j]<=S) {
        			answer++;
        		}
        	}
        }
        System.out.println(answer/2);
    }
} 