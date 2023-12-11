import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //토핑 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //토핑 저장할 해시셋 선언
        Set<String> set = new HashSet<>();
        
        //토핑 목록
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {            
            String str = st.nextToken();
            
            //토핑 목록이 Cheese로 끝나는 경우 해시셋에 넣어주기
            if(str.endsWith("Cheese")) {
                set.add(str);
            }
        }
        
        //해시셋사이즈(cheese 토핑개수)가 4개 이상인경우 yummy를, 아니면 sad 출력
        System.out.println(set.size()>=4 ? "yummy" : "sad");
    }
}