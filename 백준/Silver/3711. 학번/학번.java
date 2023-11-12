import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //테스트케이스 개수 N 입력
        int N = Integer.parseInt(br.readLine());  
 
        while(N-->0) {    
            //학생 수 G 입력 및 학번 저장 배열 선언
            int G = Integer.parseInt(br.readLine());    
            int[] num = new int[G];                   
            
            //학번 입력
            for(int i=0 ; i<G ; i++) {
                num[i] = Integer.parseInt(br.readLine());
            }
            
            //제일 작은 정답 m 선언
            int m = 0;             
            
            while(true) {
                //루프 돌때마다 m 1씩 증가
                m++;
                
                //나머지들이 다 다른지 확인하는 변수
                boolean check = true;                    
                
                //학번 나머지 저장 리스트
                ArrayList<Integer> list = new ArrayList<Integer>();   
                
                for(int i=0 ; i<G ; i++) {          
                    //m으로 나눈 나머지가 이미 나온 값이라면
                    if(list.contains(num[i]%m)) {    
                        check = false;
                        break;
                    }else{//처음 나오는 나머지라면 리스트에 추가
                        list.add(num[i] % m);
                    }
                }
                
                //순회 후 check변수가 true라면 출력 후 빠져나오기
                if(check) {
                    System.out.println(m);
                    break;
                }
            }
        }
    }
 
}
 
