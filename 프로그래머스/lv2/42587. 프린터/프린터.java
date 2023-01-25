import java.util.*;

class Solution {
    class PrintJob{
		int priority;
		int location;
		
		//생성자
		public PrintJob(int location, int priority) {
			this.location = location;
			this.priority = priority;
		}
	}
    
    public int solution(int[] priorities, int location) {
        //큐 생성
		List<PrintJob> printer = new ArrayList<PrintJob>();
		for(int i=0 ; i<priorities.length ; i++) {
			printer.add(new PrintJob(i, priorities[i]));
		}
		
		int turn=0; //수행횟수
		
		while(!printer.isEmpty()) {
			//0번을 꺼낸 후 max priority가 아니면 끝에 넣기
			PrintJob job = printer.remove(0);
			//printer에 남아있는 것들 중에 현재값보다 우선순위가 높은것이 있는가
			if(printer.stream().anyMatch(otherJob -> job.priority < otherJob.priority)) {
				printer.add(job); //존재한다면 다시 맨 뒤에 넣기
			}else {
				//max priority가 맞다면 인덱스가 location과 동일한지 확인한다
				turn++;
				
				if(location == job.location) { //문제에서 제시한 인덱스와 일치하는지 확인
					break;
				}
			}
		}
		
		return turn;
    }
}