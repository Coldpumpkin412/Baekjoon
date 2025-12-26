import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        if(M <= 2){
            System.out.println("NEWBIE!");
        }else if(N < M){
            System.out.println("TLE!");
        }else{
            System.out.println("OLDBIE!");
        }
           
    }
}