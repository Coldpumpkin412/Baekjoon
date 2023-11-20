import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //울림팀 배열 선언 및 점수 입력
        int[] a = new int[9];
        for(int i=0 ; i<9 ; i++){
            a[i] = sc.nextInt();
        }
            
        //스타트링크팀 배열 선언 및 점수 입력
        int b[] = new int[9];
        for(int i=0 ; i<9 ; i++){
            b[i] = sc.nextInt();
        }
            
        //점수 변수
        int ulim = 0;
        int stl = 0;
        
        //9회까지
        for(int i=0 ; i<9 ; i++) {
            //울림팀 점수 누적
            ulim += a[i];
            
            //울림팀이 한 번이라도 스타트링크 팀 점수를 넘은적이 있다면 역전패
            if(ulim > stl) {
                System.out.println("Yes");
                return;
            }
            
            //스타트링크팀 점수 누적
            stl += b[i];
        }
        
        System.out.println("No");
    }
}