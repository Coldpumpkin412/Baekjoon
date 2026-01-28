import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
        
		while(!str.equals("end")) {
			
            if(str.equals("animal")){
                
				System.out.println("Panthera tigris");
                
			}else if(str.equals("flower")){
                
				System.out.println("Forsythia koreana");
                
			}else if(str.equals("tree")){
                
				System.out.println("Pinus densiflora");
                
			}
            
			str = sc.next();
		}
        
	}
}