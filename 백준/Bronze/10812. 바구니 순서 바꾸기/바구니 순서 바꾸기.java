import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		//바구니 개수 N 및 회전 횟수 M 입력
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        //기존 바구니 및 회전할 바구니 선언(1~N까지 이므로 N+1까지 선언)
        int[] bucket = new int[N+1];
        int[] rot = new int[N+1];
        for(int i=1 ; i<=N ; i++) bucket[i] = i;
        
        for(int i=0 ; i<M ; i++){
        	st = new StringTokenizer(br.readLine());
        	
            int begin = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int mid = Integer.parseInt(st.nextToken());

            for(int j=0 ; j<end-mid+1 ; j++){
                rot[begin+j] = bucket[mid+j];
            }
            for(int j=0 ; j <mid-begin ; j++){
                rot[begin+end-mid+1+j] = bucket[begin+j];
            }
            for(int j = begin ; j <= end ; j++){
                bucket[j] = rot[j];
            }
        }
        
        //결과출력
        for(int i=1 ; i<=N; i++){
            System.out.print(bucket[i]+" ");
        }
	}
}

	
