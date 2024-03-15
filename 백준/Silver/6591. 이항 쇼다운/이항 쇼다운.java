import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	while (true) {
            String str1[] = br.readLine().split(" ");
            
            long N = Long.parseLong(str1[0]);
            long K = Long.parseLong(str1[1]);
            
            //0 0이 입력된 경우 종료
            if (N==0 && K==0) {
            	break;
            }
            
            long result = 1;

            if(K > N-K) {
            	K = N - K;
            }
            
            for (long i=1 ; i<=K ; i++) {
                result *= N--;
                result /= i;
            }
            
            System.out.println(result);
        }
    }
}	
