import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String t = sc.nextLine();
        String tt = sc.nextLine();
        
        int[] a = new int[100001];
        int[] b = new int[100001];
        
        for(int i=0 ; i<t.length() ; i++) {
            a[i] = t.charAt(i)-'0';
            b[i] = tt.charAt(i)-'0';
        }
        
        for(int i=0 ; i<t.length() ; i++) sb.append(a[i]&b[i]);
        
        sb.append("\n");
        
        for(int i=0 ; i<t.length() ; i++) sb.append(a[i]|b[i]);
        
        sb.append("\n");
        
        for(int i=0 ; i<t.length() ; i++) sb.append(a[i]^b[i]);
        
        sb.append("\n");
        
        for(int i=0 ; i<t.length() ; i++) sb.append(a[i]^1);
        
        sb.append("\n");
        
        for(int i=0 ; i<t.length() ; i++) sb.append(b[i]^1);
        
        sb.append("\n");
        
        System.out.println(sb.toString());
    }
}
