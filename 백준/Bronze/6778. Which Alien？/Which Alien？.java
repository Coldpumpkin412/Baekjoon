import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int E = sc.nextInt();


        if(A>=3 && E<=4){
            System.out.println("TroyMartian");
        }if(A<=6 && E>=2 ){
            System.out.println("VladSaturnian");
        }if(A<=2 && E<=3){
            System.out.println("GraemeMercurian");
        }else {

        }

    }
}
 