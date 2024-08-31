import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        Stack<Character> stack = new Stack<>();
        
        int num = 1;
        
        while(true) {
            //데이터 입력
            String str = sc.next(); 
            
            int count = 0; 
            
            //'-' 있으면 종룔
            if(str.contains("-")) {
                return;
            }
               
            for(int j=0 ; j<str.length() ; j++) { 
                if(str.charAt(j) == '{') {
                    stack.push(str.charAt(j));    
                }else { 
                    if(stack.isEmpty()) { 
                        stack.push('{'); 
                        
                        count++;            
                    }else if(stack.peek() == '{') {
                        stack.pop(); 
                    }
                        
                }
            }

            System.out.println(num+". "+((stack.size()/2)+count));
            
            stack.clear();
            num++;    
        }
    }
}