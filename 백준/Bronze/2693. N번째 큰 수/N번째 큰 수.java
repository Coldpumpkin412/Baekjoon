import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[10];
        
        //3번째 큰수를 담을 배열
        int[] results = new int[N];
        
        //각 배열을 정렬 후 3번째 큰수 출력
        for (int i=0 ; i<N ; i++) {
            for (int j=0 ; j<10 ; j++) {
                arr[j] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            results[i] = arr[7];
        }
        
        //결과
        for (int i=0 ; i<N ; i++) {
            System.out.println(results[i]);
        }
    }
}