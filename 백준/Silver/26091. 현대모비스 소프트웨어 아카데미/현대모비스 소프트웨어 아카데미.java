import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //학회원 수 N, 최소능력치 M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
		
        //학회원 능력치 리스트 선언
        List<Integer> list = new ArrayList<>();
        
        //능력치 입력
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        
        //오름차순 정렬
        Collections.sort(list);

        int minIndex = 0;
        int maxIndex = list.size() - 1;

        int answer = 0;

        while(minIndex < maxIndex) {
            int min = list.get(minIndex);
            int max = list.get(maxIndex);

            if(min+max >= M) {
                answer++;
                minIndex++;
                maxIndex--;
            }else {
                minIndex++;
            }
        }

        System.out.println(answer);
    }
}