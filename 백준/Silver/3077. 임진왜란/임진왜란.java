import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //N입력
        int N = Integer.parseInt(br.readLine());

        //해전 이름 및 입력순서 저장(key : 해전, value : 순서)
        Map<String, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0 ; i<N ; i++) {
            map.put(st.nextToken(), i);
        }
        
        //입력값을 공백에 따라 구분후 저장
        String[] input = br.readLine().split(" ");

        int count = 0;

        for (int i=0 ; i<N-1 ; i++) {
            for (int j=i+1 ; j<N ; j++) {
                if (map.get(input[i]) < map.get(input[j])) {
                    count++;
                }
            }
        }

        System.out.println(count + "/" + N*(N-1)/2);
    }
}