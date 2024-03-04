import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //해시맵 선언(key : 플레이어 이름, value : 승패)
        HashMap<String, Integer> player = new HashMap<>();
        
        //게임횟수 N, 플레이어 정보 수 P 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        //이겼을 때 W, 졌을 때 L, 아이언 벗어나기까지 G 입력
        st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());

        for(int i=0 ; i<P ; i++){
            st = new StringTokenizer(br.readLine());
            String pl = st.nextToken();

            if(st.nextToken().equals("W")){
                player.put(pl, W);    
            }else{
                player.put(pl, -L);    
            } 
        }

        int score = 0;

        for(int i=0 ; i<N ; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();

            if(!player.containsKey(name) || player.get(name) < 0){
                score = (score-L <= 0) ? 0 : score-L;
                continue;
            }

            score += player.get(name);
            
            if(score >= G){
                System.out.println("I AM NOT IRONMAN!!"); 
                return;
            }
        }

        System.out.println("I AM IRONMAN!!");
    }

}