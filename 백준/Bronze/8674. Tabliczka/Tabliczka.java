import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long[] arr = new long[2];
        
        arr[0] = sc.nextLong();
        arr[1] = sc.nextLong();

        if(arr[0]%2==0 || arr[1]%2==0) {
            System.out.println(0);
        }else {
            Arrays.sort(arr);
            System.out.println(arr[0]);
        }

    }
}