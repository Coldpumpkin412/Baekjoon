import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //S 입력 후 배열로 변환
        String S = br.readLine(); 
        char[] arr = S.toCharArray();
        
        int k = 0;
        int p = 0;
        
        int answer = 0;
        
        for(int i=0 ; i<S.length() ; i++) {
            //K인 경우
            if(arr[i] == 'K'){
                k++;
                
                if(p > 0) {
                    p--;
                }
            }else { //P인 경우
                p++;
                
                if(k > 0) {
                    k--;
                }
            }
            answer = k+p;
        }
        
        System.out.println(answer);
    }
}