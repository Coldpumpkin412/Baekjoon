import java.util.*; 

public class Main {	
    public static void main(String[] args) throws Exception{		
        Scanner sc = new Scanner(System.in);	
        
        int D = sc.nextInt();
        int M = sc.nextInt(); 
        
        int answer = 0;		
        
        int[] days = {0,0,31,28,31,30,31,30,31,31,30,31,30,31};		
        String[] day = { "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};		
        for(int i=0 ; i<=M ; i++) {
            answer += days[i];		
        }			
            
        answer += D;		
        
        System.out.println(day[answer%7]);	
    }
}