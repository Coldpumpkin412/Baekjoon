import java.util.*;
 
public class Main { 
    public static void main(String[] args) {
        /*
         * 첫 줄, 마지막 줄은 빗물이 고이지 않음.
         * 현재 높이보다 높은 블록이 왼쪽, 오른쪽에 있어야함.
         */
        Scanner sc = new Scanner(System.in);
        
        int answer = 0;
        
        //가로 및 세로 입력
        int h = sc.nextInt();
        int w = sc.nextInt();
 
        int[] height = new int[w];
        
        for(int i=0 ; i<w ; i++) {
            height[i] = sc.nextInt();
        }
        
        //모이는 빗물
        for(int i=1 ; i<w-1 ; i++) {
            int left = 0;
            int right = 0;
 
            for(int j=0 ; j<i ; j++) {
                left = Math.max(height[j], left);
            }
 
            for(int j=i+1 ; j<w ; j++) {
                right = Math.max(height[j], right);
            }
 
            if((height[i]<left) && (height[i]<right)) {
                answer += Math.min(left, right)-height[i];
            }
        }
        System.out.println(answer);
    }
}