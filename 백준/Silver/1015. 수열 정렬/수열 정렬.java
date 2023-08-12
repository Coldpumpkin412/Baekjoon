import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N 입력 및 배열, 방문처리 선언
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] order = new int[N];
        boolean[] visited = new boolean[N];
        
        //배열 값 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
            
        for(int i=0 ; i<N ; i++){
            //최솟값 및 인덱스 초기값 선언
            int min = Integer.MAX_VALUE;
            int minIdx = -1;

            for(int j=0 ; j<N ; j++){
                //방문한 적 있는경우
                if(visited[j]){
                    continue;
                }                    

                if(min>arr[j]){
                    min = arr[j];
                    minIdx = j;
                }
            }

            order[minIdx] = i;
            visited[minIdx] = true;
        }

        for(int i=0 ; i<N ; i++){
            System.out.print(order[i] +" ");
        }
    }
}