import java.util.*;
 
public class Main {
    public static void main(String args[]) {        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while(T-->0){
            String[] str = sc.next().split("");
            
            String answer = str[0];
            
            for(int i=0 ; i<str.length-1 ; i++){
                if(str[i].equals(str[i+1])) {
                    continue;
                }else{
                    answer += str[i+1];
                }
            }
            
            System.out.println(answer);
        }
 
    }
}