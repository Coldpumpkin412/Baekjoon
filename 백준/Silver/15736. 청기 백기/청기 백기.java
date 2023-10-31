import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
         * 규칙 : 백기 1번당 청기가 2의배수만큼 늘어나게 나온다
         * ex) 청백백청백백백백청백백백백
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //학생 및 깃발 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //백기(W), 청기(B) 변수 선언
        int W = 0;
        int B = 0;
        
        int idx = 2;
        
        while (true) {
            //백기는 하나씩, 청기는 2의배수만큼 늘어남
            W++;
            B += idx;
                        
            idx += 2;
            
            if (W+B >= N){
                break;
            }
        }
        
        System.out.println(W);
    }
}