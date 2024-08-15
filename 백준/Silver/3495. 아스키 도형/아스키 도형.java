import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //그림 높이 H, 너비 W 입력
        st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        
        double count = 0;
        
        for(int i=0 ; i<H ; i++) {
            //다각형 입력
            String str = br.readLine();
            
            int check = 0;
            
            for(int j=0 ; j<W ; j++) {
                char ch = str.charAt(j);
                
                if(ch=='/' || ch=='\\') {
                    count += 0.5;
                    check++;
                }
                if(check%2==1 && ch=='.')
                    count++;
            }
        }
        
        //형변환 후 출력
        System.out.println((int)count);
    }
}