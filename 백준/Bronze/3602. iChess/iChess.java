import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int B = sc.nextInt();
        int W = sc.nextInt();

        int answer = -1;
        
        int max = (int) Math.sqrt(B + W);

        for(int i=1 ; i<=max ; i++) {
            int total = (i * i);
            
            int maxCount = (total+1) / 2;
            int minCount = total / 2;
            
            if (Math.max(B, W)>=maxCount && Math.min(B, W)>=minCount) {
                answer = i;
            }
        }

        System.out.println(answer==-1 ? "Impossible" : answer);
    }
}