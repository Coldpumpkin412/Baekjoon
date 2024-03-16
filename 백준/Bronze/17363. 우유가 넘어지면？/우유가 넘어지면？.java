import java.util.*;
import java.io.*;


public class Main {
    
    //reverse 함수
    public static char reverse(char c){
        if(c == '-') return '|';
        if(c == '|') return '-';
        if(c == '/') return '\\';
        if(c == '\\') return '/';
        if(c == '^') return '<';
        if(c == '<') return 'v';
        if(c == 'v') return '>';
        if(c == '>') return '^';
        
        return c;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //행 N, 열 M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        //배열 선언
        char[][] input = new char[N][M];
        
        //배열 값 입력
        for(int i=0 ; i<N ; i++){
            String str = br.readLine();
            
            for(int j=0 ; j<M ; j++){
                input[i][j] = str.charAt(j);
            }
        }
        
        //출력
        for(int i=M-1 ; i>=0 ; i--){
            for(int j=0 ; j<N ; j++){
                System.out.print(reverse(input[j][i]));
            }
            
            System.out.println();
        }
    }
    
}