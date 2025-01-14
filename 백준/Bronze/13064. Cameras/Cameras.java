import java.util.*;
import java.io.*;

public class Main {	
	
	//차 번호 확인 함수
    private static boolean check_CarNumber(String car_Number) {
        //1. 8글자인지 확인
        if(car_Number.length() != 8) {
        	return false;
        }
        
        //2. 첫 두 글자가 동일한 숫자인지 확인
        if(car_Number.charAt(0) != car_Number.charAt(1) || !check_num(car_Number.charAt(0))) {
            return false;
        }
        
        //3. 3번째와 4번째 글자가 숫자인지 확인
        if(!check_num(car_Number.charAt(2)) || !check_num(car_Number.charAt(3))) {
            return false;
        }
        
        //4. 5번째 글자가 대문자 알파벳인지 확인
        if (!Character.isUpperCase(car_Number.charAt(4))) {
            return false;
        }
        
        //5. 마지막 세 글자가 숫자인지 확인
        for (int i = 5; i < 8; i++) {
            if (!check_num(car_Number.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
    
    //문자가 1~9 사이의 숫자인지 확인하는 함수
    private static boolean check_num(char c) {
        return '1'<=c && c<='9';
    }
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //차 번호 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        //차 번호 입력
        for(int i=0 ; i<N  ; i++) {
            String car_Number = br.readLine();
            
            //검사 후 맞으면 출력
            if(check_CarNumber(car_Number)) {
                System.out.println(car_Number);
            }
        }
        
    }
}
