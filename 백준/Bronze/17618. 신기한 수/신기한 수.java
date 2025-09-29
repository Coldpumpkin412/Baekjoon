import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int sum = 0;

        for(int i=1 ; i<N+1 ; i++){
            int num = 0;
            int index = i;

            while(index>0){
                num = num + index%10;
                index /= 10;
            }

            if(i%num == 0){
                sum += 1;
            }
        }

        System.out.println(sum);
    }
}