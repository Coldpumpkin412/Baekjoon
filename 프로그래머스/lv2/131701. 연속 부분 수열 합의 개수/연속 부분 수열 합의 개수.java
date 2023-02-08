import java.util.*;

class Solution {
    public int solution(int[] elements) {
        //중복방지를 위해 덧셈값들 저장할 Set 선언
		Set<Integer> answerList = new HashSet<>();
		
		//개수가 1개일 댸부터 배열의 길이만큼이 될때 까지 나올 수 있는 조합들 정답셋에 추가
		for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = 0; k < i; k++) {
                    if (j + k > elements.length - 1) {
                        sum += elements[j + k - elements.length];
                    } else {
                        sum += elements[j + k];
                    }
                }
                answerList.add(sum);

            }
        }
			
		return answerList.size();
    }
}