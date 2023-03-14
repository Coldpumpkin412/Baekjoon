import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//학점에 활용될 점수 총합
		double sum = 0;
		double sum_grade = 0;
		
		//학점에 반영되는 과목의 수
		double count = 0; 
		
		//20줄에 걸쳐 입력
		for(int i=0 ; i<20 ; i++) {
			st = new StringTokenizer(br.readLine());
			
			//전공명, 학점, 성적 입력
			String str = st.nextToken();
			double number = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			//P인과목은 계산에서 제외
			if(grade.equals("P")) continue;
			
            //영어 학점을 숫자로 치환
			grade = grade.replace("A+", "4.5").replace("A0", "4.0").replace("B+", "3.5").replace("B0", "3.0")
					     .replace("C+", "2.5").replace("C0", "2.0").replace("D+", "1.5").replace("D0", "1.0")
					     .replace("F", "0.0");
			
			count++;
        
			sum += (number*Double.parseDouble(grade));
			sum_grade += number;
			
		}
		System.out.printf("%f", sum/sum_grade);
		
	}
}

	
