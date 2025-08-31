import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
		ArrayList<Integer> list = new ArrayList<>();
        
		for(int i=0 ; i<N ; i++) {
			int num = sc.nextInt();
			
			if(num == 0) {
                list.add(i+1);
            }else {
                list.add(list.size()-num, i+1);
            }
		}
		
		for(int i : list){
            System.out.print(i + " ");
        }
        
	}
}