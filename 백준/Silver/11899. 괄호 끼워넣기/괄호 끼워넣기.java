import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //문자열 S 입력
        String S = br.readLine();
        
        //활용할 스택 선언 및 초기값 넣어주기
        Stack<Character> stack = new Stack<>();
        stack.push(S.charAt(0));
        
        for (int i=1 ; i<S.length() ; i++) {
            //한글자씩 단어로 분할
            char ch = S.charAt(i);
            
            if (ch=='(') {
                stack.push(ch);
            } else {
                if (stack.size()>0 && stack.peek()=='(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        
        //스택의 길이 출력
        System.out.print(stack.size());
    }
}