import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        //팀의 수 N 입력
        int N = sc.nextInt();           
        
        //코딩역량 배열 선언 및 값 입력
        int score[] = new int[2*N]; 
        for(int i=0 ; i<score.length ; i++) { // 각 학생의 점수(코딩역량)을 입력받는다. 
            score[i] = sc.nextInt();
        }
        
        //오름차순 정렬
        Arrays.sort(score);
        
        //최솟값 초기값 선언
        int min_value = 300000; // 절대 나올 수 없는 값으로 min값을 설정해준다. 
        
        int result = 0;
        
        for(int i=0 ; i<N ; i++) {
            result = score[i]+score[2*N-(i+1)]; 
            
            //최솟값 갱신
            min_value = Math.min(min_value, result);
        }
        
        System.out.println(min_value); // 최솟값을 출력해준다. 
        
        
    }
 
}
 
