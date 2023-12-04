import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //학생 수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //각 인접한 두 학생의 사탕 수 합 배열 입력
        int[] candy = new int[N];
        
        //배열의 사탕 수 전부 더해주기
        int sum = 0;
        for(int i=0 ; i<N ; i++){
            candy[i] = Integer.parseInt(br.readLine());
            
            sum += candy[i];
        }
        
        //총 합 2로 나누기
        sum /= 2;
         
        
        //구하고자하는 학생을 제외한 나머지 학생의 사탕들 모두 빼주기
        for(int i=0 ; i<N ; i++){
            int count = i%2; 
            int answer = sum;
            
            if(i<2){
                count = i+1;
            } 
            
            while(true){
                if(count >= N){
                    break;
                } 
                if(count == i){
                    count++; 
                    continue;
                } 
                
                answer -= candy[count];
                count+=2;
            }
            
            System.out.println(answer);
        }
    }
}