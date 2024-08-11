import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    
    public static void reverse(int x, int y) {
        for(int i=0 ; i<=x ; i++) {
            for(int j=0 ; j<=y ; j++) {
                if(arr[i][j] == 1){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = 1;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //세로크기 N, 가로크기 M 입력
        st = new StringTokenizer(br.readLine()); 
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int answer = 0;
        
        //배열선언
        arr = new int[N][M];
 
        for(int i=0 ; i<N ; i++) {
            String[] tmp = br.readLine().split("");
            
            for(int j=0 ; j<M ; j++){
                arr[i][j] = Integer.parseInt(tmp[j]);
            }
        }
 
        for(int i=M-1 ; i>=0 ; i--) {
            for(int j=N-1 ; j>=0; j--) {
                if(arr[j][i] == 1) {
                    reverse(j, i);
                    
                    answer += 1;
                }
                
            }
        }
 
        System.out.println(answer);
    }
}