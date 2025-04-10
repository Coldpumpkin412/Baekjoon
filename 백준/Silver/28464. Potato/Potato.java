import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        
        for(int i=0 ; i<N ; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        int sum = 0;
        
        for(int i=0 ; i<N/2 ; i++) {
            sum += arr[i];
        }
        
        System.out.print(sum + " ");
        
        sum = 0;
        
        for(int i=N/2 ; i<N ; i++) {
            sum += arr[i];
        }
        
        System.out.print(sum);
    }
}