import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //P, N 입력
        st = new StringTokenizer(br.readLine());
        int P = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        
        //정수 A들 입력 후 배열에 넣기
        st = new StringTokenizer(br.readLine());        
        while(N-->0){
            arr[N] = Integer.parseInt(st.nextToken());    
        } 
        
        //오름차순 정렬
        Arrays.sort(arr);
        
        int answer = 0;
        
        int index = 0;
        while(P<200 && index<arr.length) {
            answer++;
            P += arr[index++];
        }
        
        System.out.println(answer);
    }
}