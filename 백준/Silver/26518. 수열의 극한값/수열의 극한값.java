import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //b, c, a1, a2 입력
        st = new StringTokenizer(br.readLine());
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());
        double a1 = Double.parseDouble(st.nextToken());
        double a2 = Double.parseDouble(st.nextToken());
        
        //극한값의 성질을 활용하여 값 출력 (소수점 6번째까지)
        System.out.printf("%.6f", (b+Math.sqrt(b*b + 4*c))/2);
    }
}