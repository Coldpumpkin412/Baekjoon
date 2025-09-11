import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();
        
        System.out.print((N1+1)*(N2+1)/(N3+1) - 1);
    }
}