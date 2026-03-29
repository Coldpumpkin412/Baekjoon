import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		
		if((X+Y)*60 <= Z*60 + 30) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
        
	}
}