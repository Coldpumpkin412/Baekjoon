import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //요청 개수 M 입력
        int M = Integer.parseInt(br.readLine());
        
        //해시맵 생성(key : 볼링공 무게, value : 사물함 번호)
        Map<Integer, Integer> ball = new HashMap<>();
        
        for(int i=0 ; i<M; i++) {
            //공백 기준으로 입력 나누기
            String[] input = br.readLine().split(" ");
            
            //요청 유형
            int command = Integer.parseInt(input[0]);
            
            //1번 유형인 경우
            if(command == 1) {
                int lockerNumber = Integer.parseInt(input[1]);
                int weight = Integer.parseInt(input[2]);
                
                //해시맵에 공 무게, 사물함 번호 저장
                ball.put(Integer.parseInt(input[2]), Integer.parseInt(input[1]));
                
            }else {//2번 유형인 경우
                
                //해당 무게의 볼링공이 들어 있는 사물함 번호를 출력
                sb.append(ball.get(Integer.parseInt(input[1]))).append("\n");
            }
        }
        
        //출력
        System.out.print(sb.toString());
    }
}