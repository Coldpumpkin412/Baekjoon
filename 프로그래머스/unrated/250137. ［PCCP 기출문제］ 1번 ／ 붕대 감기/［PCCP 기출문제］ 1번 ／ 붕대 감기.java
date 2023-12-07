class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        
        //현재체력 변수
        int cur_health = health;
        
        //연속성공 변수
        int cure = 0;
        
        //시간변수
        int count = 0;
        
        //몬스터 등장 횟수
        int monster = 0;
        
        //시간이 몬스터의 마지막 공격시간이 될 때 까지
        while(count<=attacks[attacks.length-1][0]){
            //현재시간이 몬스터의 공격시간이라면
            if(count == attacks[monster][0]){
                //피해량만큼 체력감소 및 붕대시간 초기화
                cur_health -= attacks[monster][1];
                
                //체력이 0 이하가 되면 -1출력 후 종료
                if(cur_health <= 0){
                    return -1;
                }
                
                cure = 0;
                
                //다음 몬스터로 넘어가기
                monster++;
            }else{//몬스터 공격시간이 아니라면 초당 체력 회복 후 연속성공 증가
                cur_health += bandage[1];
                cure++;
            }
            
            //연속성공 횟수에 도달했을경우
            if(cure == bandage[0]){
                //추가체력 회복 및 횟수 초기화
                cur_health += bandage[2];
                cure = 0;
            }
            
            //현재 체력이 최대체력 이상일 경우 최대체력으로 갱신
            cur_health = Math.min(cur_health, health);
            
            //시간 증가
            count++;
        }
            
        return cur_health;
    }
}