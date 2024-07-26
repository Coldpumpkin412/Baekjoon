import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N 입력
        int N = Integer.parseInt(br.readLine());
        
        //구슬 배열
        int[] num = new int[N+1];
        
        //번호입력
        st = new StringTokenizer(br.readLine());        
        for(int i=1 ; i<=N ; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        //오름차순 정렬
        Arrays.sort(num);
        
        long sum = 0;
        
        for(int i=4 ; i<N ; i+=2) {
            sum += num[i]-num[i-2];
        }
        
        sum += num[N]-num[N-1];
        sum += num[2]-num[1];
        
        for(int i=3 ; i<N ; i+=2) {
            sum+=num[i]-num[i-2];
        }
        
        sum += num[N]-num[N-2];
        
        System.out.println(sum);
    }
}