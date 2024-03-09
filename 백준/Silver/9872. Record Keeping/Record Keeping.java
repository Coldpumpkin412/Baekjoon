import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        while(N-->0) {
            //입력값 character 배열 형으로 변환
            char[] group = br.readLine().toCharArray();
            
            //오름차순 정렬
            Arrays.sort(group);

            String key = new String(group);
            
            //누적값 올리기
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int max = 0;
        
        //최댓값 판별
        for(String key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        
        System.out.println(String.valueOf(max));
    }
}