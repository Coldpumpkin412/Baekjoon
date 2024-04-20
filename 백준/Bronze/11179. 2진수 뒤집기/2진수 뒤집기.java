import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = in.nextInt();

        String str = Integer.toBinaryString(N);
        sb.append(str);
        
        sb.reverse();

        //2진수 문자열을 10진수 정수로 변환
        System.out.print(Integer.parseInt(sb.toString(), 2));
    }
}