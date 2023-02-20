import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        /*
		 * 맵 두 개 생성
		 * 1. 주차관리 맵(key : 차량번호, value : 입차시간)
		 * 2. 주차시간 맵(key : 차량번호, value : 누적주차시간)
		 * **정답출력시 차량번호에 따라 오른차순 정렬을 할 것이므로 주차시간 맵은 트리맵으로 선언
		 */
		Map<String,String> parking = new HashMap<>();
		Map<String,Integer> time = new TreeMap<>();
		
		//문자열 한 줄씩 확인
		for(String str : records) {
			//공백 기준으로 분할
			String[] info = str.split(" ");
			
			//마지막 데이터가 IN일 때(입차) : 주차관리 맵에 저장
			if(info[2].equals("IN")) {
				parking.put(info[1], info[0]);
			}else {//마지막 데이터가 OUT일 때(출차) : 주차맵에서 제거 후 주차시간맵에 저장
				//입차시간의 시와 분
				int inHour = Integer.parseInt(parking.get(info[1]).substring(0,2));
				int inMinute = Integer.parseInt(parking.get(info[1]).substring(3));
				//출차시간의 시와 분
				int outHour = Integer.parseInt(info[0].substring(0,2));
				int outMinute = Integer.parseInt(info[0].substring(3));
				
				//출차시간의 분이 입차시간의 분보다 작은경우
				if(outMinute < inMinute) {
					//주차시간 맵에 더해주기
					time.put(info[1], time.getOrDefault(info[1], 0)+(outHour-inHour-1)*60 + outMinute-inMinute+60);
				}else {//아닌경우
					time.put(info[1], time.getOrDefault(info[1], 0)+(outHour-inHour)*60 + outMinute-inMinute);
				}
				
				//주차관리맵에서 제거
				parking.remove(info[1]);
			}
		}
		
		//문자열을 다 돈 후 주차관리 맵에 데이터가 남아있는경우 23:59 출차로 처리
		for(String str : parking.keySet()) {
			//입차시간의 시와 분
			int inHour = Integer.parseInt(parking.get(str).substring(0,2));
			int inMinute = Integer.parseInt(parking.get(str).substring(3));
			
			time.put(str, time.getOrDefault(str, 0)+(23-inHour)*60 + 59-inMinute);
		}
		//주차시간 맵은 트리맵이기때문에 이미 오름차순 정렬이 돼있음
		int[] answer = new int[time.size()];
		
		int i=0;
		for(String key : time.keySet()) {
			//기본요금 + {(주차시간-기본시간) / 단위시간} * 단위요금
			if(time.get(key) > fees[0]) {
				answer[i] = fees[1] + (int)Math.ceil(((time.get(key) - fees[0]) / (double)fees[2])) * fees[3];
			}else {//기본시간 이하인경우 기본요금
				answer[i] = fees[1];
			}
			
			i++;
		}
		
		return answer;
    }
}