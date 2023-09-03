import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        //아스키코드 활용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //입력된 문자열을 char 배열로 변경
        char[] rot13 = br.readLine().toCharArray();
        
        for (int i=0 ; i<rot13.length ; i++) {
            //대문자인 경우
            if (rot13[i]>='A' && rot13[i]<='Z') {
                if (rot13[i] >= 'N') {
                    rot13[i] -= 13;
                } else {
                    rot13[i] += 13;
                }
            } else if (rot13[i] >= 'a' && rot13[i] <= 'z') {//소문자인 경우
                if (rot13[i] >= 'n') {
                    rot13[i] -= 13;
                } else {
                    rot13[i] += 13;
                }
            }
        }
        
        //문자열로 저장 후 출력
        for (char ch : rot13){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
