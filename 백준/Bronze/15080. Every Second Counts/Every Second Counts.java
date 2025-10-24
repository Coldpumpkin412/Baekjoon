import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] time1 = a.split(" : ");
        
		String b = sc.nextLine();
		String[] time2 = b.split(" : ");
        
		
		
		int total1 = 3600*Integer.parseInt(time1[0]) + 60*Integer.parseInt(time1[1]) + Integer.parseInt(time1[2]);
		int total2 = 3600*Integer.parseInt(time2[0]) + 60*Integer.parseInt(time2[1]) + Integer.parseInt(time2[2]);
        
		int answer = 0;
        
		if(total1 <= total2) {
			answer = total2 - total1;
		}else {
			answer = 86400 - total1 + total2;
		}
		
		System.out.println(answer);
	}
}