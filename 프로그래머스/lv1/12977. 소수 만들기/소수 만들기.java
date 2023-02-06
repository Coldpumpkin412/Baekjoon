import java.util.*;

class Solution {
    //소수 판별 함수
    public static boolean isPrime(int x){
        int end = (int)Math.sqrt(x); //double로 매개변수를 받기때문에 int로 형변환
        //3가지 수의 합이기 때문에 절대 2는 나올 수 없음
        for(int i=2 ; i<=end ; i++){
            if(x%i==0) return false;
        }
        
        return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0; //소수의 개수
        
        //배열에서 3가지 수를 뽑아 소수 판별
        for(int i=0 ; i<nums.length-2 ; i++){
            for(int j=i+1 ; j<nums.length-1 ; j++){
                for(int k=j+1 ; k<nums.length ; k++){
                    int sum = nums[i]+nums[j]+nums[k]; //3가지 수의 합
                    if(isPrime(sum)) answer++; //소수가 맞으면 카운트
                }
            }
        }
        return answer;
    }
    
}