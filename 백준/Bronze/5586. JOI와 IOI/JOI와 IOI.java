import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0 ; i<s.length()-2 ; i++) {            
            boolean check = s.charAt(i+1)=='O' && s.charAt(i+2)=='I';
            
            if(s.charAt(i) == 'J') {
                if(check) {
                    count1++;
                }
            }
            if(s.charAt(i) == 'I'){
                if(check) {
                    count2++;
                }
            }
        }

        System.out.println(count1);
        System.out.println(count2);
    }
}