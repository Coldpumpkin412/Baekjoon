import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //N개의 소괄호로 이루어진 문자열 입력
        String N = sc.next();
        
        //입력값 분해
        String[] line = N.split("");

        int count = 0;
        int sum = 0;

        for(int i=1 ; i<line.length ; i++) {
            if (line[i].compareTo(line[i-1]) == 0) {
                if (line[i].compareTo("(") == 0){
                    count++;
                }else{
                    sum += count;
                }                    
            }
        }
        
        //정답 출력
        System.out.println(sum);
	}
}