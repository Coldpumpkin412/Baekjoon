import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        int[] arr = new int[3];
        
        for(int i=1 ; i<=T ; i++) {
            for(int j=0 ; j<3 ; j++) {
                arr[j] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            
            if(Math.pow(arr[0], 2) + Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) {
                System.out.println("Scenario #" + i + ":");
                System.out.println("yes");
            }else {
                System.out.println("Scenario #" + i + ":");
                System.out.println("no");
            }
            System.out.println();
        }
        
    }
}