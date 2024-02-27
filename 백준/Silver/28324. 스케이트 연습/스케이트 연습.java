import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long answer = 1;
        int pre = 1;
        
        for(int i=N-2 ; i>=0 ; i--){
            if(pre < arr[i]){
                pre++;
            }else if(pre > arr[i]){
                pre = arr[i];
            }
            answer += pre;
        }

        System.out.println(answer);
    }
}