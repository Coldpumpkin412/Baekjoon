import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int P = sc.nextInt();
        int[] arr = new int[P];      
        
        int count = 0;
        int index = N;

        while(true) {
            index = index * N % P;
            arr[index]++;
            
            if(arr[index] == 3) {
                break;
            }
        }

        for(int i=0 ; i<P ; i++) {
            if(arr[i] > 1) {
                count++;    
            }
        }
        System.out.println(count);
    }
}