import java.util.*;

class Solution {
    
	//정답 저장 배열
	static int[] answer = new int[2];
	
	//square함수
	static boolean square(int[][] arr, int x , int y, int length, int value) {
		
		for(int i=x ; i<x+length ; i++) {
			for(int j=y ; j<y+length ; j++) {
				//정사각형으로 압축이 불가한 경우
				if(arr[i][j]!=value) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	//Quad 함수
	static void Quad(int[][] arr, int x, int y, int length) {
		//정사각형으로 압축 가능여부 판단
		if(square(arr, x, y, length, arr[x][y])) {
			//1인 경우 answer 1열 증가
			if(arr[x][y]==1) {
				answer[1]++;
			}else { //아닌경우 answer 0열 증가
				answer[0]++;
			}
			
			return;
		}
		
		//재귀적으로 쿼드압축 함수 호출
		Quad(arr, x, y, length/2);
		Quad(arr, x, y+length/2, length/2);
		Quad(arr, x+length/2, y, length/2);
		Quad(arr, x+length/2, y+length/2, length/2);
	}
    
    public int[] solution(int[][] arr) {
		/*
		 * 시작점(0,0) 및 배열길이로 Quad함수 실행
		 * Quad함수에서 정사각형으로 압축 가능한지 판단(square함수), 안된다면 4개로 나누어 재귀적 실행
		 */
		
		//쿼드압축 함수 실행
		Quad(arr, 0, 0, arr.length);
		
		return answer;
    }
}