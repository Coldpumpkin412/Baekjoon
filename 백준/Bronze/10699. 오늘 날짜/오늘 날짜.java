import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;	

public class Main {
	public static void main(String[] args) {
		//Date 클래스 활용
		Date now = new Date();
		
		//연-월-일 형식을 위해 SImpleDateFormat 활용
		DateFormat DF = new SimpleDateFormat("YYYY-MM-dd");
		
		//시간대 UTC+0 감안, 위치 또한 서울
		DF.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		
		System.out.println(DF.format(now));
	}
}

	
