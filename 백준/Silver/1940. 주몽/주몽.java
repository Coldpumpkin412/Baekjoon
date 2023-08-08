import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        //투ㅗ인터 활용하여 풀기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N, M 입력 및 강철 배열 선언
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] material = new int[N];
        
        //배열 값 입력
        st = new StringTokenizer(br.readLine());
        for (int i=0 ; i<N ; i++) {
            material[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for(int i=0 ; i<N ; i++)  {
            //누적합 및 끝자리 변수
            int sum = 0;
            int end = i+1;

            while (end<N) {
                sum = material[i];
                sum += material[end++];
                
                //같아질때 루프 벗어나기
                if (sum==M) {
                    answer++;
                    break;
                }
            }

        }

        System.out.println(answer);

    }
}