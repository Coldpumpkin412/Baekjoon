import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //선물개수 N, 예산 B, 할인 받는 최대 선물 개수 A 입력        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 선물의 개수
        int B = Integer.parseInt(st.nextToken()); // 초기 예산
        int A = Integer.parseInt(st.nextToken()); // 할인 받을 수 있는 최대 선물 개수
        
        int now = A;

        //선물 가격 리스트 선언
        List<Integer> list = new ArrayList<>();
        
        //선물 가격 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        
        //오름차순 정렬
        Collections.sort(list);
        
        int index = 0;
        
        while(index < N) {
            if(A > 0) {
                B -= (list.get(index) / 2);
                A--;
            }else {
                if(now == 0){
                    B -= list.get(index);
                }else{
                    B -= list.get(index-now) / 2;
                    B -= (list.get(index) / 2);
                }
            }
            
            if(B < 0) {
                break;
            }
            
            index++;
        }
        System.out.println(index);
    }
}