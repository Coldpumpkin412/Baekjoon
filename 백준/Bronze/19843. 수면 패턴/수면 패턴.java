import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //자야하는 시간 T, 잠든횟수 N 입력
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        //요일에 대한 인덱스 저장을 위한 해시맵 선언(key : 요일, value : 인덱스)
        Map<String, Integer> day = new HashMap<>();
        
        day.put("Mon", 1);
        day.put("Tue", 2);
        day.put("Wed", 3);
        day.put("Thu", 4);
        day.put("Fri", 5);
        
        //전체 잠든 시간
        int total = 0;
        
        //잠든 정보 입력
        for(int i=0 ; i<N ; i++){
            //한 번 잤을 때 잠든 시간
            int time = 0;
           
            //잠든 요일 D1, 시간 H1, 깬 요일 D2, 시간 H2
            st = new StringTokenizer(br.readLine());
            String D1 = st.nextToken();
            int H1 = Integer.parseInt(st.nextToken());
            String D2 = st.nextToken();
            int H2 = Integer.parseInt(st.nextToken());
            
            //잠든요일과 깬 요일을 인덱스로 변환
            int index_D1 = day.get(D1);
            int index_D2 = day.get(D2);
            
            //잠든 요일과 깬 요일이 같은경우
            if(index_D1 == index_D2){
                time = H2 - H1;
            }else{ //다른경우
                time = 24 - H1 + H2 + (index_D2-index_D1-1) * 24;
            }
            
            total += time;
        }
        
        //전체 잠든 시간이 T보다 많은경우
        if(total >= T) {
            System.out.println("0");
        } else if(T-total <= 48) {//차이가 48보다 적은경우
        	System.out.println(T-total);
        }else {
            System.out.println("-1");
        }
        
    }
}	
