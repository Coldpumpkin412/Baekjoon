import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
       
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        
        int count = 0;

        while(N-->0) {
            st = new StringTokenizer(br.readLine());
            String key = st.nextToken().substring(0, 2);
            String value = st.nextToken();

            if(key.equals(value)) {
                continue;
            }

            String concat = key.concat(value);
            map.put(concat, map.getOrDefault(concat, 0) + 1);

            count += map.getOrDefault(value.concat(key), 0);
        }

        System.out.println(count);
    }

}