import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
		int N = Integer.parseInt(br.readLine());
        
		String pattern = br.readLine();		//패턴
		String[] pArr = pattern.split("\\*");	//*을 기준으로 두개의 문자열로 나누기 (*로 나누려면 역슬래쉬 2개 붙여줘야함)
		
		while(N-->0) {
			String str = br.readLine();		//검증할 파일 이름
            
			//*을 뺀 패턴 문자열보다 검증할 파일 이름 길이가 짧으면 검증이 안됨
			if (pArr[0].length() + pArr[1].length() > str.length()) {
				sb.append("NE\n");
				continue;
			}
			
			String front = str.substring(0, pArr[0].length());	//파일이름 앞부분
			String back = str.substring(str.length()-pArr[1].length(), str.length());	//파일이름 뒷부분
			
			if (front.equals(pArr[0]) && back.equals(pArr[1])) {	//앞, 뒤 모두 패턴과 같다면 일치
				sb.append("DA\n");
			} else {
				sb.append("NE\n");
			}
		}
        
        System.out.println(sb);
	}
}