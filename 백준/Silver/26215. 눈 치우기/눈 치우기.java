import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //집의 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //집 앞에 쌓인 눈의 양 배열 선언
        int[] num = new int[N];
        
        //눈 양 총 합, 최댓값
        int max = 0;
        int sum = 0;
        
        //눈의 양 입력
        st = new StringTokenizer(br.readLine());        
        for(int i=0 ; i<N ; i++){
            num[i] = Integer.parseInt(st.nextToken());
            
            //눈의 양 누적합
            sum += num[i];
            
            //최댓값 최신화
            max = Math.max(max, num[i]);
        }
        
        int remain = sum - max;
        
        int answer = sum / 2;
        
        
        if(sum%2 != 0){
            answer++;
        }
        
        if(max > remain){
            answer = max;
        }
        
        //최대시간(1440)을 넘기면 -1을, 아니면 answer 출력
        System.out.println((answer>1440) ? -1 : answer);
    }
}