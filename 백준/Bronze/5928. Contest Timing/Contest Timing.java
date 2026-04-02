import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int D = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if(D<11 || (D==11 && H<11) || (D==11 && H==11 && M<11)) {
            System.out.println(-1);
        }else {
            System.out.println((D-11)*24*60 + (H-11)*60 + (M-11));
        }
    }
}