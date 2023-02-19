import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] height = new int[9];
		int sum=0; //키의 합
        
		//9명의 키 입력
		for(int i=0 ; i<9 ; i++) {
			height[i] = sc.nextInt();
			sum += height[i];
		}
		
		//9명의 키의 합에서 2명의 키를 빼주었을 때 100이 되는 경우를 찾는다
		for(int i=0 ; i<8 ; i++) {
			for(int j=i+1 ; j<9 ; j++) {
				if(sum - height[i] - height[j] == 100) {//키가 100이 된 경우
					//해당되지 않는 두 명의 키를 -1로 최신화해준다
					height[i] = -1;
					height[j] = -1;
					
					//오름차순 정렬
					Arrays.sort(height);
                    //0번째 인덱스와 1번째 인덱스의 값은 -1이 될 것이므로 2번째 인덱스부터 9번째 인덱스까지 7개출력
		            for(int k=2 ; k<9 ; k++) System.out.println(height[k]);
					
                    return;
				}
			}
		}
		
		
		sc.close();
	}
}

	
