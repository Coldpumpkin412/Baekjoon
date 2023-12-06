import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true){
            //N, M 입력
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            
            //초기값 선언
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            //랭킹정보 점수 배열
            int[] score = new int[10001];
            
            //둘 다 0이 입력되면 루프 빠져나오기
            if(N==0 && M==0){
                break;
            }
            
            //N주 동안
            for(int i=0 ; i<N ; i++){
                st = new StringTokenizer(br.readLine());
                
                //상위 M명의 점수
                for(int j=0 ; j<M ; j++){
                    int idx = Integer.parseInt(st.nextToken());
                    score[idx]++;
                }
            }

            //1등점수 최신화
            for(int i=1 ; i<10001 ; i++){
                first = Math.max(first, score[i]);
            }

            //2등점수 최신화
            for(int i=1 ; i<10001 ; i++){
                if(score[i] != first){
                    second = Math.max(second, score[i]);
                }
            }

            //2등선수 정보 저장
            for(int i=1 ; i<10001 ; i++){
                if(score[i] == second){
                    sb.append(i+" ");
                }
            }

            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}