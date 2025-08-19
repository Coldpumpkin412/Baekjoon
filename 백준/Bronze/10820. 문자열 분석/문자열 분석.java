import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String str;
        
        while((str = br.readLine()) != null){
            int lower = 0;  //소문자 개수
            int upper = 0;   //대문자 개수
            int num = 0;  //숫자 개수
            int emp = 0;  //공백 개수
            
            for(int i=0 ; i<str.length() ; i++){
                char c = str.charAt(i);
                
                if(c == ' '){
                    emp++;
                } 
                if(Character.isUpperCase(c)){
                    upper++;
                }
                if(Character.isLowerCase(c)){
                    lower++;
                }
                if(Character.isDigit(c)){
                    num++;
                }
            }
            sb.append(lower + " " + upper + " " + num + " " + emp + "\n");
        }
        
        System.out.print(sb.toString());
    }
}