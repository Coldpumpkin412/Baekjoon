import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); 
        String key = sc.next(); 

        for(int i=0 ; i <str.length() ; i++) {
            if(str.charAt(i) == ' '){
                System.out.printf(" ");
            }else {
                
                int N = str.charAt(i) - key.charAt(i%key.length()) - 1;

                if(N < 0) {
                    N += 26; 
                }

                System.out.printf((char)(N%26 + 'a') + "");
            }
        }
    }
}