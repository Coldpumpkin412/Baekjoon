import java.util.*;
import java.io.*;

public class Main {    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;
        
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0){
            //출력 초기화
            sb = new StringBuilder();
            
            //불판상태 H, 문자 W 입력
            st = new StringTokenizer(br.readLine());                        
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            
            //좌우로 뒤집기
            for(int i=0 ; i<H ; i++){
                String line = br.readLine();
                for(int j=W-1 ; j>=0 ; j--){
                    sb.append(line.charAt(j));
                }
                sb.append("\n");
            }
            System.out.println(sb);
        }
    }
}