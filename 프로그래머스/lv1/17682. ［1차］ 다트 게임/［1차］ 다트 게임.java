import java.util.*;

class Solution {
    public int solution(String dartResult) {
        char[] arr = dartResult.toCharArray(); //한글자씩 분할
		int[] score = new int[3]; //3차시 시도의 점수를 각각 저장할 배열
		int idx=0; //점수배열의 인덱스
		String num = ""; //정수가 10일 수도 있기때문에 문자열로 먼저 받기
        
        for(int i=0 ; i<arr.length ; i++) {
			//0~9사이의 숫자일 경우
			if('0'<=arr[i] && arr[i]<='9') num += String.valueOf(arr[i]);
			else if(arr[i]=='S' || arr[i]=='D' || arr[i]=='T') { //문자일때
				if(arr[i]=='S') score[idx] = Integer.parseInt(num);
				else if(arr[i]=='D') score[idx] = Integer.parseInt(num) * Integer.parseInt(num);
				else score[idx] = Integer.parseInt(num) * Integer.parseInt(num) * Integer.parseInt(num);
				
				idx++;
				num=""; //초기화
			}
			else {//*혹은#일때
				if(arr[i]=='*') {
					score[idx-1] *= 2;
					if(idx>=2) score[idx-2] *= 2;
				}else {
					score[idx-1] *= -1;
				}
			}
		}
        int answer = score[0]+score[1]+score[2];
        return answer;
    }
}