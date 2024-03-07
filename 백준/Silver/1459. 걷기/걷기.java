import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //집 위치 x, y 및 평행이동시간 w, 대각선 이동시간 s 입력        
        st = new StringTokenizer(br.readLine());
        long x=Long.parseLong(st.nextToken());
        long y=Long.parseLong(st.nextToken());
        long w=Long.parseLong(st.nextToken());  //평행이동시간
        long s=Long.parseLong(st.nextToken());  //대각선이동시간
        
        //평행이동
        long temp1 = (x+y) * w;
        
        long temp2 = 0;
        
        if((x+y) % 2 == 0){
                temp2 = Math.max(x,y) * s;
        }else{
            temp2 = (Math.max(x,y) - 1) * s + w;
        }

        long temp3 = (Math.min(x, y))*s+(Math.abs(x-y))*w;

        System.out.println(Math.min(temp1, Math.min(temp2, temp3)));
    }
}