import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        //문장입력 및 스택 선언
        String str = br.readLine();
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
        
        //left스택에 넣어주기
        for(int i=0 ; i<str.length() ; i++){
            leftStack.push(str.charAt(i));
        }
        
        //N입력
        int N  = Integer.parseInt(br.readLine());

        for(int i=0 ; i<N ; i++){
            String str2 = br.readLine();
            
            switch (str2.charAt(0)){
                case 'L':
                    if(leftStack.empty()){
                        break;
                    } 
                    
                    rightStack.push(leftStack.pop());
                    break;
                case 'D':
                    if(rightStack.empty()) {
                        break;
                    }
                    
                    leftStack.push(rightStack.pop());
                    break;
                case 'B':
                    if(leftStack.empty()) {
                        break;
                    }
                    
                    leftStack.pop();
                    break;
                case 'P':
                    leftStack.push(str2.charAt(2));
                    break;
            }
        }
        //left스택이 빌때까지 헤드값을 right스택에 넣어주기
        while(!leftStack.empty()){
            rightStack.push(leftStack.pop());
        }
        
        //결과 저장 및 출력
        while (!rightStack.empty()){
            sb.append(rightStack.pop());
        }
        System.out.println(sb.toString());
    }
}

