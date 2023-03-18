import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

        while(true) {
            //문자열 입력
        	String str = sc.nextLine();
            
            int count = 0;
            if(str.equals("#")) {
                break;
            }

            str = str.toLowerCase();

            for(int i=0; i<str.length(); i++) {
               switch(str.charAt(i)) {
                     case 'a':	count++;	continue;
                     case 'e':	count++;	continue;
                     case 'i':	count++;	continue;
                     case 'o':  count++;	continue;
                     case 'u':	count++;	continue;
                        
                    default:    break;
               }
            }            
            System.out.println(count);
        }
	}
}

	
