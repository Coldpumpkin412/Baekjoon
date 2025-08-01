import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        while(N-->0){
            int[] alpa = new int[26];
            char[] words1 = sc.next().toCharArray();
            char[] words2 = sc.next().toCharArray();
            
            for(char ch : words1) {
                alpa[ch-97]++;
            }
            
            for(char ch : words2) {
                alpa[ch-97]--;
            }
            
            boolean flag = true;
            
            for(int i : alpa) {
                if(i != 0) {
                    flag = false;
                }
            }
                
            System.out.println(flag ? "Possible" : "Impossible");
        }
    }
}