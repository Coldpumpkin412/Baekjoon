import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        //지점 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //횡단보도 거리 배열
        int[] crossArr = new int[N];
        
        //왼쪽 길 거리, 오른쪽 길 거리 배열
        int[] leftArr = new int[N-1];
        int[] rightArr = new int[N-1];
        
        //횡단보도 거리 배열 값 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            crossArr[i] = Integer.parseInt(st.nextToken());
        }
        
        //왼쪽 길 거리 배열 값 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N-1 ; i++) {
            leftArr[i] = Integer.parseInt(st.nextToken());
        }
        
        //오른쪽 길 거리 배열 값 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N-1 ; i++) {
            rightArr[i] = Integer.parseInt(st.nextToken());
        }
        
        //최솟값 변수  
        long minValue = Long.MAX_VALUE;
        
        //몇번째 지점인지
        int index = -1;
        
        for(int i=0 ; i<N ; i++) {
            long min = crossArr[i];
            
            //왼쪽 길에 대한 누적합
            for(int j=0 ; j<i ; j++) {
                min += leftArr[j];
            }
            
            //오른쪽 길에 대한 누적합
            for(int j=i; j<N-1 ; j++) {
                min += rightArr[j];
            }
            
            //최솟값 갱신 및 지점 갱신
            if(minValue > min) {
                minValue = min;
                index = i+1;
            }
        }
        
        System.out.println(index + " " + minValue);
    }
}