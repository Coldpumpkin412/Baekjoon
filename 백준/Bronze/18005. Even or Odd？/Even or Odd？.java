import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        if(N%2 == 1){
            System.out.println(0);
            return;
        }else{
            if((N+1)%2==1 && (N/2)%2==1){
                System.out.println(1);
                return;
            }else{
                System.out.println(2);
                return;
            }
        }
    }
}