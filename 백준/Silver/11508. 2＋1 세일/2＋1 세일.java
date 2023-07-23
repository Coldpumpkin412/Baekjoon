import java.util.*;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //유제품 개수 N입력 및 배열 선언
        int N = sc.nextInt();
        Integer[] arr = new Integer[N];

        for(int i=0 ; i<N ; i++) {
            arr[i] = sc.nextInt();
        }
        //내림차순 정렬
        Arrays.sort(arr, Comparator.reverseOrder());

        int answer = 0;
        for(int i=0 ; i<N ; i++){
            if(i%3==2) {
                continue;
            }
            
            answer += arr[i];
        }
        
        System.out.println(answer);
    }
}