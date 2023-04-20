import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //시험장의 수 입력 및 그에따른 배열의 크기 입력
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //총감독관과 부감독관이 감시할 수 있는 인원의 수B,C 입력
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        //숫자의 범위로 인해 long형으로 선언할것
        long answer = 0;

        answer += N;

        for(int i=0 ; i<N ; i++) {
            arr[i] -= B;
            
            if (arr[i] <= 0) continue;
            
            answer += arr[i] / C;
            
            if(arr[i]%C != 0) {
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}