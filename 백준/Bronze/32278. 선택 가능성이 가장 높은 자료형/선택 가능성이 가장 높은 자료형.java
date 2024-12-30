import java.util.*;
import java.io.*;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//N 입력
    	long N = Long.parseLong(br.readLine());
    	
    	if(-Math.pow(2, 15)<=N && N<Math.pow(2, 15)) {
    		System.out.println("short");
    	}else if(-Math.pow(2, 31)<=N && N<Math.pow(2, 31)) {
    		System.out.println("int");
    	}else {
    		System.out.println("long long");
    	}
    }
}
