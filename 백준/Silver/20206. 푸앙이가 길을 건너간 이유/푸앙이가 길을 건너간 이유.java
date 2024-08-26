import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        //A, B, C 입력
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        //X1, X2, Y1, Y2 입력 
        st = new StringTokenizer(br.readLine());
        int X1 = Integer.parseInt(st.nextToken());
        int X2 = Integer.parseInt(st.nextToken());
        int Y1 = Integer.parseInt(st.nextToken());
        int Y2 = Integer.parseInt(st.nextToken());

        int dangerMin; 
        int dangerMax;
        int pathMin; 
        int pathMax;

        
        int t1 = -1*A*X1 - C;
        int t2 = -1*A*X2 - C;
        pathMin = t1 < t2 ? t1 : t2;
        pathMax = t1 > t2 ? t1 : t2;

        t1 = B * Y1;
        t2 = B * Y2;
        dangerMin = t1 < t2 ? t1 : t2;
        dangerMax = t1 > t2 ? t1 : t2;

        if(pathMin>=dangerMax || pathMax<=dangerMin) {
            System.out.print("Lucky");
        }else {
            System.out.print("Poor");
        }
            
    }
}