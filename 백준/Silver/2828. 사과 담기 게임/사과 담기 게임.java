import java.util.*;

public class Main {
    public static void main(String[] args){
       //그리디 알고리즘 활용        
       Scanner sc = new Scanner(System.in);
        
       //N,M입력
       int N = sc.nextInt();
       int M = sc.nextInt();
        
       //스크린 및 바구니 배열 선언
       int[] screen = new int[N];//스크린
       int[] basket = new int[M];//바구니
       
        
       //바구니 위치 변수 선언
       int left = 0;
       int right = left+M-1;
        
       //J입력
       int J = sc.nextInt();
       
       //거리변수 선언
       int distance = 0; 
        
       for(int i=0 ; i<J ; i++){
           //사과 위치
           int apple=sc.nextInt()-1;
           
           if(apple<left){
               int diff = left-apple; //사과와 바구니 거리차이
               
               distance += diff;
               
               //바구니 왼쪽으로 이동
               left -= diff;
               right -= diff;
           }
           else if(apple>right){
               int diff=apple-right; //사과와 바구니 거리차이
               
               distance+=diff;
               
               //바구니 오른쪽으로 이동
               right += diff;
               left += diff;
           }
       }
        
       //거리차이(정답) 출력
       System.out.println(distance);
    }
}
