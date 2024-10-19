import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //학생수 N, 숫자 L 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String L = st.nextToken();

        int count = 0;
        while(N > 0){
            count++;
            
            if(!String.valueOf(count).contains(L)){
                N--;
            }
        }

        System.out.print(count);
    }

}