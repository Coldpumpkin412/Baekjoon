import java.util.*;
import java.io.*;

public class Main { 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N, K 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        //인형 배열 선언
        int[] doll = new int[N];
        
        //라이언 인형 위치 저장 리스트
        ArrayList<Integer> lion = new ArrayList<Integer>();  
        
        //인형정보 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            doll[i]=Integer.parseInt(st.nextToken());
            
            //라이언인 경우 위치 저장
            if(doll[i] == 1) {
                lion.add(i);    
            }
        }
        
        //라이언 인형 개수가 K보다 작으면 -1 출력 후 종료
        if(lion.size() < K) { 
            System.out.println(-1);
            return;
        }
        
       
        int start = 0;
        int end = K-1;    
        int min = Integer.MAX_VALUE; 
        int count = 0;
        
        while(true) {
            if(end == lion.size()) {
                break;
            }
            count = lion.get(end)-lion.get(start)+1;
            
            //최솟값 갱신
            min = Math.min(min, count);
            
            start++;
            end++;
        }
        
        System.out.println(min);
    }
}