import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //파일 개수 N입력
        int N = Integer.parseInt(br.readLine());
        
        //파일 이름 저장 배열 선언 및 이름 입력
        String[] arr = new String[N];  
        for (int i=0 ; i<N ; i++) {
            arr[i] = br.readLine();  
        }
        
        int len = arr[0].length(); 
        
        for (int  i=0 ; i<len ; i++) {
            //체크변수
            boolean check = true;
            
            //첫 파일의 i번째 단어
            char ch = arr[0].charAt(i);  
            
            for (int j=1 ; j<N ; j++) {
                //단어가 다르면 false
                if (ch!=arr[j].charAt(i)) {
                    check = false;  
                }
            }
            
            //모든 파일의 단어가 같으면 저장
            if (check) {
                sb.append(ch); 
            } else {//다르면 ? 저장
                sb.append("?");  
            }
        }
        
        System.out.print(sb);
    }
}