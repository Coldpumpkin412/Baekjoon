import java.util.*;

public class Main {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //활잡이 수 N 압력 및 배열 선언
        int N = sc.nextInt(); 
        int[] arr = new int[N];
        
        //배열 값 입력
        for (int i=0 ; i<N ; i++) {
            arr[i] = sc.nextInt();
        }
        
        //최솟값으로 초기값 선언
        int answer = Integer.MIN_VALUE;
        for (int i=0 ; i<N ; i++) {
            
            int count = 0;
            
            for (int j=i+1 ; j<N ; j++) {
                //자신보다 높으면 count 증가
                if (arr[i] > arr[j]) { 
                    count++;
                } else {
                    break;
                }
            }
            
            //최댓값으로 최신화
            answer = Math.max(answer, count);
        }
        
        System.out.println(answer);
    }
}