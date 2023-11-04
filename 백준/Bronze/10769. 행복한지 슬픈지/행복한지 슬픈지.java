import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
        
        //각 표정을 빈칸으로 치환(공백이 아니라 아예 길이가 0)하여 남은 길이 계산
		int smile = (str.length() - str.replace(":-)", "").length()) / 3;
		int sad = (str.length() - str.replace(":-(", "").length()) / 3;

		String answer = "";
                
        //개수에 따른 값 출력
		if (smile==0 && sad == 0) {
            System.out.println("none");
		} else if (smile > sad) {
			System.out.println("happy");
		} else if (sad > smile) {
			System.out.println("sad");
		} else {
			System.out.println("unsure");
		}		        
	}
}