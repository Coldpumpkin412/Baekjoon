import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //탑의 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //탑 높이 저장 배열 선언 
        int[] arr = new int[N];
        
        //탑 높이 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } 
        
        //정답 초기값
        int answer = Math.max(arr[0], arr[N-1]);
        
        for(int i=1 ; i<N-1 ; i++) {
            answer = Math.max(answer, arr[i] + Math.min(arr[i-1], arr[i+1]));
        } 
        
        System.out.println(answer);
    }
}	
