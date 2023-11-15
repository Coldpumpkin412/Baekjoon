import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        

        // 값 입력
        List<Integer> list = new ArrayList<>();
        
        String str;
        while ((str = br.readLine()) != null) {
            sb.append(str);
        }
        
        //, 기준
        st = new StringTokenizer(sb.toString(), ",");
        while (st.hasMoreTokens()) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        // 합 출력
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }

}