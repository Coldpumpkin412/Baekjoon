import java.util.Scanner;

public class Main {
     private static void nextPermutation(int[] arr) {
        int n = arr.length;
        boolean check = true;
         
        Loop1: for (int i=n-1 ; i>0 ; i--) {
            if (arr[i-1] < arr[i]) {
                for (int j=n-1 ; j>=i ; j--) {
                    if (arr[j] > arr[i-1]) {
                        int temp = arr[j];
                        
                        arr[j] = arr[i-1];
                        arr[i-1] = temp;
                        
                        int k = n-1;
                        
                        while (i < k) {
                            int temp2 = arr[i];
                            arr[i] = arr[k];
                            arr[k] = temp2;
                            i++;
                            k--;
                        }
                        check = false;
                        break Loop1;
                    }
                }
            }
        }
        if (check) {
            System.out.println(-1);
        } else {
            showArray(arr);
        }
    }

    private static void showArray(int[] arr) {
        for (int i=0 ; i<arr.length ; i++)
            System.out.println(arr[i]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i=0 ; i<num; i++) {
            arr[i] = sc.nextInt();
        }

        nextPermutation(arr);
    }
}
