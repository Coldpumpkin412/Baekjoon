import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[4];
        
        for(int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();        

        int count = 0;
        
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] == X) {
                System.out.println(i+1);
                count ++;
            }
        }

        if(count == 0) {
            System.out.println(0);
        }
        
    }
}