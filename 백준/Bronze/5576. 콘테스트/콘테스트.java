import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] arr2 = new int[10];
        
        int w = 0;
        int k = 0;
        
        for(int i=0 ; i<10 ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<10 ; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        for(int i=9 ; i>arr.length-4 ; i--) {
            w += arr[i];
            k += arr2[i];
        }

        System.out.println(w + " " + k);
    }
}
