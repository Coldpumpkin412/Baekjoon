import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //N 및 재현이 기분 입력
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        double M = Integer.parseInt(st.nextToken());
        
        //공백 기준으로 분할 및 M 최신화
        double[] arr = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        M = (1-M) * 1000;

        for(int i=0 ; i<N ; ++i) {
            M = M*arr[0] + (1000-M)*arr[2];
        }

        System.out.println(String.format("%.0f", M));
        System.out.println(String.format("%.0f", 1000 - M));
    }
}