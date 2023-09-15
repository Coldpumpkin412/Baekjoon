import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //참가자 수 N 입력 및 해시맵 선언
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        
        //참가자 입력
        for(int i=0 ; i<N ; i++) {
            String key = br.readLine();
            
            //처음 입력된 경우 1을 부여, 이후부터 빈도 수 증가
            if(map.get(key) == null) {
                map.put(key, 1);
            }else {
                map.put(key, map.get(key) + 1);
            }
        }
        
        //완주자는 빈도 수 1 감소
        for(int i=0 ; i<N-1 ; i++) {
            String str = br.readLine();
            
            map.put(str, map.get(str) - 1);
        }
        
        //빈도가 0이 아닌경우 출력
        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                System.out.println(key);
                break;
            }
        }
    }
}