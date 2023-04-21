import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //요일 저장배열
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        
        //월, 일 입력
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        
        int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int n = 0;
        
        for (int i = 0; i < m; i++) {
            n += months[i];
        }
        
        n += d-1;
        
        System.out.print(days[n%7]);
    }
}