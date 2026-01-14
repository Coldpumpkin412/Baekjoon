import java.util.*;
import java.math.*;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        long tmp = 0;
        
        for(int  i=0 ; i<str.length() ; i++) {
        	tmp = (10*tmp + (str.charAt(i)-'0')) % 20000303;
        }
        
        System.out.println(tmp);
    }
}