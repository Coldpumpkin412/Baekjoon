import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer = "";
        for(int i=0 ; i<a.length() ; i++){
            char ch = a.charAt(i);
            
            //소문자인 경우
            if(97<=ch && ch<=122){
                answer += Character.toUpperCase(ch);
            }else{
                answer += Character.toLowerCase(ch);
            }
                
        }
        
        System.out.println(answer);
    }
}