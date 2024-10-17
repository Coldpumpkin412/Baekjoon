import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //이름 길이 입력
        int N = sc.nextInt();
        
        int score = 0;

        //이름 입력 후 배열로 변환 
        char[] NAME = sc.next().toCharArray();

        for(int i=0 ; i<N ; i++) {
            //아스키코드 활용
            score += (((int)NAME[i]) - 64);
        }

        System.out.println(score);
    }
}