import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
        List<Integer> num=new ArrayList<>();
        
    	int N = sc.nextInt();
    	    	
    	for(int i=0 ; i<N ; i++) {
    		num.add(sc.nextInt());
    	}
    	
    	System.out.println(Collections.max(num)-Collections.min(num));
   }
}