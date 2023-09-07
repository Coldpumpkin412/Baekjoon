import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //테스트케이스 개수 입력
        int T = Integer.parseInt(br.readLine());
        
        while(T-->0) {
            int count = 0;
            
            //N 입력 및 배열 선언
            int N = Integer.parseInt(br.readLine());            
            int[] arr = new int[N+1];
            
            st = new StringTokenizer(br.readLine());

            //순열 값 입력
            for(int i=1 ; i<arr.length ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            //방문처리 배열
            boolean[] visited = new boolean[N+1];

            for(int i=1 ; i<=N ; i++){

                if(!visited[i]){
                    visited[i] = true;
                    
                    int next = arr[i];

                    while(true){
                        if(visited[next]){
                            count++;
                            break;
                        }
                        visited[next] = true;
                        next = arr[next];
                    }
                }
            }

            System.out.println(count);
        }

    }
}