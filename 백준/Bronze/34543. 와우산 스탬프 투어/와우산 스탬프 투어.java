import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //등산객이 방문한 명소의 개수 N 입력
        int N = Integer.parseInt(br.readLine());
       
        //등산객의 총 걸음 수 W 입력
        int W = Integer.parseInt(br.readLine());
        
        //투어 점수 변수
        int score = 0;
        
        //방문한 명소 한 곳당 10점 추가
        score = 10 * N;
        
        //방문한 명소가 3개 이상이면 추가로 20점 더 받음
        if(3<=N && N<=5){
            score += 20;
        }
        
        //5개의 명소 모두 방문했다면 모든 추가점수 외에 특별 보너스 50점 더 받음
        if(N == 5){
            score += 50;
        }
        
        //등산객의 걸음 수가 1000보를 초과하면 최종 점수에서 15점 감점
        if(W > 1000){
            score -= 15;
        }
        
        //(점수는 0점 밑으로 내려가지 않음)
        if(score < 0){
            System.out.println("0");
        }else{
            System.out.println(score);
        }
        
    }
}