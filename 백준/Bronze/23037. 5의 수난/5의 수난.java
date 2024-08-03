import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int[] c = new int[s.length()];
        
        int answer = 0;
        
        for(int i=0 ; i<s.length() ; i++) {
            c[i] = s.charAt(i) - '0';
        }
        
        for(int i=0 ; i<c.length ; i++) {
            answer += Math.pow(c[i], 5);
        }
        System.out.println(answer);
    }
}