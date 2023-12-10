import java.util.*;
import java.io.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        //정답을 임시로 저장할 리스트 선언
		List<int[]> list = new ArrayList<>();
		
		//기준에 따라 index 설정하기
		int index = 0;
		
		switch(ext) {
			case "code" : index = 0; break;
			case "date" : index = 1; break;
			case "maximum" : index = 2; break;
			case "remain" : index = 3; break;
		}
		
		//뽑아낼 정보의 기준값 val_ext보다 작은 데이터만 선정하여 리스트에 넣어주기
		int count = 0;
		for(int i=0 ; i<data.length ; i++) {
			if(data[i][index] < val_ext) {
				list.add(data[i]);
			}
		}
		
		//리스트의 값을 배열에 넣어주기
		int[][] answer = new int[list.size()][4];
		for(int i=0 ; i<list.size() ; i++) {
			answer[i] = list.get(i);
		}
		
		//sort_by 기준이 어떤것인지 확인
		switch(sort_by) {
			case "code" : index = 0; break;
			case "date" : index = 1; break;
			case "maximum" : index = 2; break;
			case "remain" : index = 3; break;
		}
		
		//람다식 내부 지역변수 선언을 위해 final 형 변수를 따로 선언 후 index값 넣어주기
		final int sort_index = index;
		
		//람다식 활용하여 sort_index기준 오름차순 정렬 식 선언
		Arrays.sort(answer, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[sort_index] - o2[sort_index];
			}
		});
		
		return answer;
    }
}