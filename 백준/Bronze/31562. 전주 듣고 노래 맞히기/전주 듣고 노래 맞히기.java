import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        //노래개수 N, 시도할 개수 M 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //해시맵 선언(key : 첫 세음, value : 노래제목)
        Map<String, String> map = new HashMap<>();
        
        while(N-->0) {
            String[] arr = br.readLine().split(" ", 3);
            String key = arr[2].substring(0, 5);

            map.put(key, map.containsKey(key) ? "?\n" : arr[1]+"\n");
        }

        while(M-->0) {
            sb.append(map.getOrDefault(br.readLine(), "!\n"));
        }
        
        System.out.println(sb.toString());
    }
}