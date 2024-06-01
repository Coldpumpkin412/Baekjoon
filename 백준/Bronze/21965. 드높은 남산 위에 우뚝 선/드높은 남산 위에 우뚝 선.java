import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st;
        
        boolean check = true;
        
        //수열 길이 N 입력
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        
        //수열 값 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        int count = 0;
        
        for(int i=1 ; i<N ; i++) {
            if(num[i-1] < num[i]) {
                if(count == -1) {
                    check = false;
                    break;
                }
                count++;
            }else if(num[i-1] == num[i]) {
                check = false;
                break;
            }else {
                count = -1;
            }
        }
        
        System.out.print(check ? "YES" : "NO");
    }
}