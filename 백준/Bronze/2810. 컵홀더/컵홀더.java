import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //좌석 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //좌석 정보 저장 배열
        String s = br.readLine();
        String str = "";
        
        for (int i=0 ; i<N ; i++) {
            //일반석인 경우
            if (s.charAt(i) == 'S') {  
                str += "*S";
            } else {//커플석인 경우
                str += "*LL";  
                i++;
            }
        }
        //마지막 자리에 * 추가
        str += "*"; 
        
        int count = 0;
        
        for (int i=0 ; i<str.length() ; i++) {
            if (str.charAt(i) == '*') {
                count++;
            }
        }
        
        count = Math.min(count, N);
        
        System.out.print(count);
    }
}