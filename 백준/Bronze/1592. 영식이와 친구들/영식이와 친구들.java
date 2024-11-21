import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //친구 수 N, M번 받으면 경기종료, 시계방향 L번째에게 패스
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 
        int L = Integer.parseInt(st.nextToken()); 
        
        //공 받은 횟수 저장 배열
        int[] arr = new int[N+1]; 
        
        int index = 1; 
        
        //공 던진 횟수
        int count = 0; 
        
        while(true) {
            arr[index]++;

            if(arr[index] == M) {
                break;
            }

            //홀수인 경우
            if(arr[index]%2 == 1) { 
                index += L;
                
                //원형이므로 다시 돌아감
                if(index > N) {
                    index -= N;
                }
            }else { // 짝수일 때
                index -= L;
                
                if(index <= 0) {
                    index += N;
                }
            }
            count++;
        }

        System.out.println(count);
    }
}