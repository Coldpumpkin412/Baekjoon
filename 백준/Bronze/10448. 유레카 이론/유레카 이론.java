import java.util.*;
import java.io.*;

public class Main {
    
    //유레카 함수
    public static int Eureka(int K, int[] triNum) {
        for(int i=1 ; i<45 ; i++) {
            for(int j=1 ; j<45 ; j++) {
                for(int k=1 ; k<45 ; k++) {
                    int sum = triNum[i] + triNum[j] + triNum[k];
                    
                    if(sum == K) {
                        return 1;
                    }
                }
            }
        }
        
        return 0;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //테스트케이스 개수 T 입력
        int T = Integer.parseInt(br.readLine());
        
        //삼각수 배열 선언 및 값 선언
        int[] triNum = new int[45];
        for(int i=1 ; i<45 ; i++) {
            triNum[i] = i * (i+1)/2;
        }
        
        while(T-->0) {
            //K 입력
            int K = Integer.parseInt(br.readLine());
            
            int answer = Eureka(K, triNum);
            
            System.out.println(answer);
        }
    }
}