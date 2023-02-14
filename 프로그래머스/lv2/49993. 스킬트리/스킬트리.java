import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
		
		//선행스킬 저장할 큐 선언
		Queue<String> queue = new LinkedList<>();
		for(String str : skill.split("")) queue.add(str);
		
		
		for(int i=0 ; i<skill_trees.length ; i++) {
			boolean check = true; 
			
			//스킬트리의 문자열을 한글자 씩 분할
			String[] trees = skill_trees[i].split("");
			
			for(int j=0 ; j<trees.length ; j++) {
				//skill배열에 없는경우
				if(!skill.contains(trees[j])) continue;
				
				else {//skill 배열에 있는경우
					//큐의 헤드값과 일치하지않으면 false
					if(!queue.peek().equals(trees[j])) check = false;
					else {//큐의 헤드값과 일치하면 poll
						queue.poll();
					}
				}
			}
            
			if(check) answer++;
			
			//큐 초기화
			queue.clear();
			for(String str : skill.split("")) queue.add(str);
		}
		
		return answer;
    }
}