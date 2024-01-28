import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int new_score = sc.nextInt();
        int p = sc.nextInt();  //랭킹 리스트에 오를 수 있는 갯수.
        
        //배열 선언 및 값 입력(내림차순정렬을 위해 Integer.로 선언)
        Integer[] arr = new Integer[N];
        for(int i=0 ; i<N ; i++){
            arr[i] = sc.nextInt();
        }
        
        //내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        if(N==p && new_score<=arr[arr.length-1]){
            System.out.print(-1);
        } else{
            int rank = 1;
            
            for(int i=0 ; i<arr.length ; i++){
                if(new_score < arr[i]){
                    rank++;
                } else{
                    break;
                }                    
            }
            
            System.out.print(rank);
        }
    }
}