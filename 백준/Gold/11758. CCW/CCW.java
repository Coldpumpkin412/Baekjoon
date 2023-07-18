import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws Exception {
        /*
         * 반시계방향인 경우 : P1~P2의 기울기 < P1~P3의 기울기
         * 시계방향인 경우 : P1~P2의 기울기 > P1~P3의 기울기
         */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        
        //점 P1입력
		st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		
        //점 P2입력
		st = new StringTokenizer(br.readLine());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
        //점 P3입력
		st = new StringTokenizer(br.readLine());
		int x3 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		
        //기울기비교(나눗셈이 들어가는경우 정확도가 떨어지므로 곱셈형식으로 표현)
		int incline1 = (y3-y1)*(x2-x1);
		int incline2 = (y2-y1)*(x3-x1);
                
        //결과 출력
		if(incline1==incline2){
            System.out.println(0);
        } else if(incline1>incline2){
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
	}
}