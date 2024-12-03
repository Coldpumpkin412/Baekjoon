import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //한 평수당 비용 C 입력
        double C = Double.parseDouble(br.readLine());
        
        //잔디밭 수 L 입력
        int L = Integer.parseInt(br.readLine());
        
        //잔디밭 총 넓이
        double sum = 0.0;
        
        while(L-->0){
            //각 잔디밭 가로, 세로 길이 입력
            st = new StringTokenizer(br.readLine());
            double row = Double.parseDouble(st.nextToken());
            double col = Double.parseDouble(st.nextToken());
            
            //잔디밭 넓이 갱신
            sum += row*col;
        }
        
        //총 비용
        double cost = sum * C;
        
        System.out.printf("%.7f", cost);
    }
}