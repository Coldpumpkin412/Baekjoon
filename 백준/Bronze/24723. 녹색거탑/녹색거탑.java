import java.util.*;

public class Main{
    public static void main(String[] args){
        //2의 거듭제곱 꼴을 표현하면 된다.
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int answer = 1;
        
        while(N-->0){
            answer *= 2;
        }
        
        System.out.println(answer);
    }
}