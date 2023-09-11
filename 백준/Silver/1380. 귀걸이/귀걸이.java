import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //시나리오 변수
        int sce = 0;    
        
        while(true) {
            int N = Integer.parseInt(br.readLine());
            
            //입력이 0인경우 종료
            if (N == 0) {    
                return;
            }else {
                sce++;
            }
            
            //여학생 리스트 선언
            List<String> girls = new ArrayList<String>(); 
            
            //여학생 이름 입력
            for(int i=0 ; i<N ; i++) {                     
                girls.add(br.readLine());
            }
            
            //숫자 리스트 선언
            List<Integer> Num = new ArrayList<Integer>();  
            
            for(int i=0 ; i<2*N-1 ; i++ ) {                        
                st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());           
                
                //숫자가 있는경우
                if (Num.contains(num)) {         
                    //귀걸이 되돌려받으므로 제거
                    Num.remove((Integer)num);            
                }else { //리스트에 없다면 추가
                    Num.add(num);                      
                }
            }
            
            int resultgirl = Num.get(0);                
            
            System.out.println(sce + " " + girls.get(resultgirl-1));    // 시나리오 번호와 귀걸이를 돌려받지 못한 학생 출력  
        }
    }
}