import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int answer = N % 14;
        
        if(answer == 1) {
            System.out.println("W");
        }else if(answer==2 || answer==7) {
            System.out.println("e");
        }else if(answer == 3) {
            System.out.println("l");
        }else if(answer == 4) {
            System.out.println("c");
        }else if(answer==5 || answer==9) {
            System.out.println("o");
        }else if(answer == 6) {
            System.out.println("m");
        }else if(answer == 8) {
            System.out.println("T");
        } else if(answer == 10) {
            System.out.println("S");
        }else if(answer == 11) {
            System.out.println("M");
        }else if(answer == 12) {
            System.out.println("U");
        }else if(answer == 13) {
            System.out.println("P");
        }else {
            System.out.println("C");
        }
    }
}