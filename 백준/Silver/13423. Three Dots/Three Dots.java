import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //테스트케이스 개수 T
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            //점의 개수 N입력 및 점 위치 저장 배열 선언
            int N = Integer.parseInt(br.readLine());
            int[]dot = new int[N];
            
            //점 위치 입력
            st = new StringTokenizer(br.readLine());
            for(int i=0 ; i<N ; i++){
                dot[i] = Integer.parseInt(st.nextToken());  
            }
            
            //오름차순 정렬
            Arrays.sort(dot);
            
            int answer = 0;
            
            for(int i=0 ; i<N-2 ; i++) {
                int k = i+2;
                
                for(int j=i+1 ; j<N-1 ; j++) {
                    //점 ab 길이
                    int ba = dot[j] - dot[i];
                    
                    while(k<N && dot[k]-dot[j]<ba) {
                        k++;
                    }
                    
                    if(k == N){
                        break;  
                    } 
                    
                    if(dot[k] - dot[j] == ba){
                        answer++;    
                    } 
                }
            }
            System.out.println(answer);
        }
    }
}