import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //메뉴 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //해시셋 선언
        Set<Integer> set = new HashSet<>();
        
        int max = 0;
        
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<2*N ; i++) {
            //메뉴번호 입력
            int num = Integer.parseInt(st.nextToken());
            
            //해시셋에 있으면 제거 없으면 추가
            if(set.contains(num)) {
                set.remove(num);
            }else {
                set.add(num);    
            }
            
            //최댓값 갱신
            max = Math.max(max, set.size());
        }
        System.out.println(max);
    }
}