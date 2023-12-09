import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //문자열길이 N, 세로로 번진 개수 H, 가로로 번진 개수 W 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); 
        int H = Integer.parseInt(st.nextToken()); 
        int W = Integer.parseInt(st.nextToken());
        
        //배열 선언 및 초기값 입력('?'로 채워주기)
        char[] ch = new char[N];
        Arrays.fill(ch,'?');
        
        while(H-->0){
            String str = br.readLine();
            
            for(int i=0 ; i<N*W ; i++){
                char c = str.charAt(i);
                
                if(c == '?'){
                    continue;
                }else{
                    ch[i/W] = c;
                }
            }
        }

        for(int i=0 ; i<N ; i++){
            System.out.print(ch[i]);
        }
    }
}