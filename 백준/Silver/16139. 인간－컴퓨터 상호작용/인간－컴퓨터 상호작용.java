import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //문자열 S 입력
        String S = br.readLine(); 
        
        //질문 수 Q 입력
        int Q = Integer.parseInt(br.readLine()); 

        int[][] alpha = new int[S.length()+1][26];

       
        for(int i=1 ; i<=S.length() ;i++) {
            //탐색문자
            int word = S.charAt(i-1)-'a';

            //알파벳 a부터 z까지 반복
            for(int j=0 ; j<26 ; j++) {
                //탐색문자 이전 값
                int before = alpha[i-1][j];
                
                //알파벳과 탐색 중인 문자가 같으면 (이전 값+1), 다르면 이전값
                alpha[i][j] = (j==word ? before+1 : before);
            }
        }
        
        //테스트케이스
        while(Q-->0){
            st = new StringTokenizer(br.readLine());
            
            //A, L, R 입력
            int A = st.nextToken().charAt(0)-'a'; 
            int L = Integer.parseInt(st.nextToken())+1;
            int R = Integer.parseInt(st.nextToken())+1; 
            
            System.out.println(alpha[R][A]-alpha[L-1][A]);
        }
    }
}