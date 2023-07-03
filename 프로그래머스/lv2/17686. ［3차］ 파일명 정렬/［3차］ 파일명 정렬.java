import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        /*
		 * 조건에 따른 정렬을 위해 Comparator 활용하여 구현
		 */
		String[] answer = new String[files.length];
		
		//파일들의 헤드, 넘버, 테일 저장 변수
		String[][] list = new String[files.length][3];
		
		for(int i=0 ; i<files.length ; i++) {
			String str = files[i];
			
			//시작, 끝 인덱스 초기화 및 확인, 사이즈 변수
			int start_Index = -1;
			int end_Index = -1;
			int size = 0;
			boolean check = true;
			
			for(int j=0 ; j<str.length() ; j++) {
				//숫자를 만나게 되면
				if(Character.isDigit(str.charAt(j))) {
					//true인 경우
					if(check) {
						//시작 인덱스 저장 및 체크 변수 변환
						start_Index = j;
						check = false;
					}
					
					size++;
				}else {
					if(!check) break;
				}
			}
			
			end_Index = start_Index + size - 1;
			
			//헤드, 넘버, 테일 저장
			list[i][0] = str.substring(0,start_Index);
			list[i][1] = str.substring(start_Index, end_Index+1);
			list[i][2] = str.substring(end_Index+1);
		}
		
		//CompareTo 활용하여 정렬
		Arrays.sort(list, (o1, o2) -> {
            if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase(Locale.ROOT)) > 0){
                return 1;
            }else if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase(Locale.ROOT)) < 0){
                return -1;
            }else{
                if(Integer.parseInt(o1[1]) > Integer.parseInt(o2[1])){
                    return 1;
                }else if(Integer.parseInt(o1[1]) < Integer.parseInt(o2[1])){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
		
		for(int i=0 ; i<answer.length ; i++) {
			answer[i] = list[i][0] + list[i][1] + list[i][2];
		}
		
		return answer;
    }
}