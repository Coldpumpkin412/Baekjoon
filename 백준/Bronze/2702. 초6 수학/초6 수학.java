import java.util.*;
import java.io.*;
 
public class Main {
    //유클리드 호제법
    public static int GCD(int a, int b) {
        if(a%b == 0) {
            return b;
        }
        
        return GCD(b, a % b);
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
 
        while(T-->0) {
            st = new StringTokenizer(br.readLine());
            
            //A, B 입력
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            //최대공약수
            int index = GCD(A, B);
            System.out.print(A*B / index + " ");
            System.out.println(index);
        }
 
    }
}
 
