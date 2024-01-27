import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //16진수 숫자를 문자열로 입력값 받기
        String input = sc.next();
        
        //10진수 정수형으로 변경 후 출력
        System.out.println(Integer.parseInt(input, 16));
    }
}