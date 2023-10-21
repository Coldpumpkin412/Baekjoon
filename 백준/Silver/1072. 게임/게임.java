import java.util.*;

public class Main {
    static long X, Y, Z;
    
   //이분탐색 메소드
    public static void binarySearch(long start, long end) {
        long mid = 0; 
        long ratio = 0;
        
        while (start <= end) {
            mid = (start + end) / 2;
            ratio = (Y + mid) * 100 / (X + mid);

            if (ratio > Z) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(start);
     }

    public static void main(String[] args) throws Exception {
        //이분탐색 활용하여 풀기
        Scanner sc = new Scanner(System.in);
        
        //게임 횟수 및 이긴게임 입력
        X = sc.nextLong();
        Y = sc.nextLong();

        Z = Y * 100 / X;
        
        if (Z >= 99){
             System.out.println(-1);
        } else{
            binarySearch(1, X);
        }
    }
}