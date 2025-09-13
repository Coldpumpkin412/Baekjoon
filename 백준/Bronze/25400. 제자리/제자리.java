import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] card = new int[N];
        
        for(int i=0 ; i<N ; i++) {
            card[i] = sc.nextInt();
        }

        int index = 1; 
        
        int count = 0;

        for(int i=0 ; i<N ; i++) {
            if(card[i] == index) {
                index++;
            }else {
                count++;
            }
        }

        System.out.println(count);
        
    }
}