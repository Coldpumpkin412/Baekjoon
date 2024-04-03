import java.util.*;
import java.io.*;

public class Main {   

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

    
        String input = br.readLine();
        //정규식 활용
        input = input.replaceAll("[,;]", "");
        //분할
        String[] str = input.split(" ");
        
        for(int i=1 ; i<str.length ; i++) {
            StringBuilder type = new StringBuilder(str[0]);
            StringBuilder name = new StringBuilder();
            
            int index = 0;
            
            while(index<str[i].length() && Character.isAlphabetic(str[i].charAt(index))) {
                name.append(str[i].charAt(index));
                index++;
            }
            
            for(int j=str[i].length()-1 ; j>=index ; j--) {
                if(str[i].charAt(j) == ']') {
                    type.append("[]");
                    j--;
                }else{
                    type.append(str[i].charAt(j));
                }
                    
            }
            sb.append(type + " " + name + ";\n");
        }
        
        System.out.println(sb.toString());
    }
}