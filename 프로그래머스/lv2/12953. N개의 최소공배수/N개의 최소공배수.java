import java.util.*;

class Solution {
    private static int gcd(int num1, int num2) {
		int r = num1%num2; //나머지
		if(r==0) return num2;
		else return gcd(num2,r);
	}
    
    public int solution(int[] arr) {
		int answer = 0;
		int g = gcd(arr[0],arr[1]); //처음 두 원소의 최대공약수
		answer = (arr[0]*arr[1])/g; //처음 두 원소의 최소공배수
		
		if(arr.length==1) return arr[0]; //원소가 한 개 인 경우 바로 출력
		
		if(arr.length>2) {
			for(int i=2 ; i<arr.length ; i++) {
				g = gcd(answer,arr[i]);
				answer = (answer*arr[i])/g;
			}
		}
		return answer;
	}
}