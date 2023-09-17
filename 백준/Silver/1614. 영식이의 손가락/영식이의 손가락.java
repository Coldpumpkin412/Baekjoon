import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        //점화식 활용하여 풀어주기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //다친 손가락 및 활용 가능 횟수 입력
        long finger = Long.parseLong(br.readLine());
        long num = Long.parseLong(br.readLine());
        
        long result = 0;
        
        if(finger == 1) {
            result = (long)(num*8);
        }else if(finger == 2) {
            result = (long)(1 + (num/2)*8+(num%2)*6);
        }else if(finger == 3) {
            result = (long)(2 + (num/2)*8+(num%2)*4);
        }else if(finger == 4) {
            result = (long)(3 + (num/2)*8+(num%2)*2);
        }else {
            result = (long)(4 + num*8);
        }
        
        System.out.println(result);
    }
}