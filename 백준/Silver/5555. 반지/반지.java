import java.util.*;
import java.io.*;
 
public class Main {
 
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //문자열 입력
        String str = br.readLine();
        String output;
        int count = 0;
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i=0 ; i<N ; i++) {
            //입력된 문자열 저장 후 더해주기
            output = br.readLine();
            output += output;
             
            //문자열을 포함한다면 카운트 증가
            if (output.contains(str)) {
                count++;
            }
        }
        System.out.println(count);
 
    }
}
