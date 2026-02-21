import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int min_burger = 2001;
		int min_drink = 2001;
 
        //상, 중, 하 버거 값
		for(int i=0 ; i<3 ; i++) {
			int burger = Integer.parseInt(br.readLine());
            
            //최솟값 갱신
            min_burger = Math.min(burger, min_burger);
		}
 
		//콜라, 사이다
		for(int i=0 ; i<2 ; i++) {
			int drink = Integer.parseInt(br.readLine());
            
            //최솟값 갱신
            min_drink = Math.min(drink, min_drink);			
		}
 
		System.out.println(min_burger + min_drink - 50);
	}
 
}