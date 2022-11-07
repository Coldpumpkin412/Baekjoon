public class Main {

	public static void main(String[] args) { //메인
		boolean[] arr = new boolean[10001];
		
		for(int i=0 ; i<=10000 ; i++) {
			int dnum = d(i);
			if(dnum<=10000) {
				arr[dnum] = true;
			}
		}
		for(int i=0 ; i<=10000 ; i++) {
			if(!arr[i]) System.out.println(i);
		}
	}
	
	public static int d(int number) { //함수
		int sum = number; //각자리 수를 다 더한것 저장할 용도의 변수 선언
		
		while(number != 0) {
			sum += number%10; //기존에 수에 1의자리수 더라기
			number /= 10; //1의 자리 수 제거 후 루프 다시 돌아서 한 자리만 남을때까지 실시
		}
		return sum;
	}
}