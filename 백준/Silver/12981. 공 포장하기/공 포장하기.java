import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //R, G, B 값 넣을 배열 선언
        int[] arr = new int[3];
        
        //R, G, B 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<3 ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //오름차순 정렬
        Arrays.sort(arr);
        
        int count = arr[0];
        
        arr[1] -= arr[0];
        arr[2] -= arr[0];
        
        count += arr[1]/3+arr[2]/3;
        count += (arr[1]%3!=0) ? 1 : 0;
        count += (arr[2]%3!=0) ? 1 : 0;
        
        if(arr[1]%3==1 && arr[2]%3==1) {
            count--;
        }
            
        System.out.println(count);
    }
}