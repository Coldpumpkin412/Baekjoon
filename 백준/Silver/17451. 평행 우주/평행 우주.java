import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //행성 N 입력 및 배열 선언
        int N = Integer.parseInt(br.readLine());
        long[] planet = new long[N];
        
        //속도 v 입력 
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            planet[i] = Long.parseLong(st.nextToken());
        }
        
        //정답변수 초기값 선언
        long answer = planet[N-1];
        
        for(int i=N-2 ; i>=0 ; i--){
            if(answer < planet[i]){
                answer = planet[i];
            }else if(planet[i]<answer && answer%planet[i]!=0){
                answer = ((answer/planet[i]) + 1) * planet[i];
            }
                
        }
        
        System.out.println(answer);
    }
}