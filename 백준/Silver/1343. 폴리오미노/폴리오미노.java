import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        //문자열 입력
		String board = br.readLine();  

		board = board.replaceAll("XXXX", "AAAA");
		board = board.replaceAll("XX", "BB");
		
		if(board.contains("X")) {
			System.out.println(-1);
		}else {
			System.out.println(board);
		}
	}

}
