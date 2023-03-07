import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, Integer> map = new HashMap<>();
		
		//각 색과 값을 해시맵 형태로 입력
		map.put("black", 0);
		map.put("brown", 1);
		map.put("red", 2);
		map.put("orange", 3);
		map.put("yellow", 4);
		map.put("green", 5);
		map.put("blue", 6);
		map.put("violet", 7);
		map.put("grey", 8);
		map.put("white", 9);
		
		String color1 = br.readLine();
		String first = Integer.toString(map.get(color1));
		
		String color2 = br.readLine();
		String second = Integer.toString(map.get(color2));
		
		//첫색상과 두번째 색상을 합친 후 정수형으로 변환
		long number = Long.parseLong(first+second);
		
		//세번째로 들어오는 입력은 10^(key) 형태로 곱해준다
		String color3 = br.readLine();
		long ten = (long)Math.pow(10, map.get(color3));
		
		System.out.println(number * ten);
	}
}

	
