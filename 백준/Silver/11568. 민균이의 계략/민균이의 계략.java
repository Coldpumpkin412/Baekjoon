import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //카드 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        List<Integer> list = new ArrayList<>();
        
        //첫번째 정수 입력
        st = new StringTokenizer(br.readLine());
        list.add(Integer.parseInt(st.nextToken()));

        //2~N번째 정수 입력
        for(int i=1 ; i<N ; i++) {           
            int num = Integer.parseInt(st.nextToken());

            for(int j=0 ; j<list.size() ; j++) {
                if(list.get(j) >= num) {
                    list.remove(j);
                    
                    list.add(j, num);
                    break;
                }

                if(j == list.size()-1) {
                    list.add(num);
                }
                    
            }
        }

        System.out.println(list.size());
    }
}