import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //정수 N년 입력
	    int N = Integer.parseInt(br.readLine());
        
        //1월~12월 해당 일 수 미리 설정(첫 인덱스는 제외)
	    int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	    //2019년부터 13일의 금요일의 수 구하기
        //'19.01.01 은 화요일이다.
        
	    int answer = 0;
        int date = 13;
        
        //비교값 (y:연도, m:월)
	    for(int y=2019 ; y<=N ; y++) {
		    for(int m=1 ; m<=12 ; m++) {
			    //13일의 금요일인 경우 정답 증가
			    if(date%7 == 4){ //19년1월1일이 화요일이므로 화요일을 기준값 1로 한다
                    answer++;
                } 
			    //해당월 일수만큼 더하기
			    date += days[m];
                
			    //윤년
			    if(m==2 && ((y%4==0 && y%100!=0) || y%400==0)){
                    date++;
                } 
		    }
	    }
        
	    System.out.println(answer);
    }
}
