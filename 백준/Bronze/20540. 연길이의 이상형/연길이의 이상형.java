import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        
        String answer = "";

        for(int i=0 ; i<4 ; i++) {
            char ch = str.charAt(i);

            if(ch == 'I'){
                answer += "E";
            }else if(ch == 'E'){
                answer += "I";
            }else if(ch == 'N'){
                answer += "S";
            }else if(ch == 'S'){
                answer += "N";
            }else if(ch == 'T'){
                answer += "F";
            }else if(ch == 'F'){
                answer += "T";
            }else if(ch == 'J'){
                answer += "P";
            }else{
                answer += "J";
            }
        }

        sb.append(answer);
        
        System.out.println(sb.toString());
    }
}